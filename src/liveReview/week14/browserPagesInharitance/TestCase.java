package liveReview.week14.browserPagesInharitance;

public class TestCase {

    public static void main(String[] args) {

        //        // If I want to use fields and methods of Browser Class:
        //        do I have to create an object from browser class?
        //        Can I also reach with child class object?

        AmazonHomepage amazonHomepage = new AmazonHomepage("Chrome");

        System.out.println("I am automating : " + amazonHomepage.getName());
        System.out.println("My operating system is : " + Browser.getOSName() ); // use calls name for static field

        amazonHomepage.navigateTo("www.amazon.com");

        amazonHomepage.navigateTo("Search for laptops");

        amazonHomepage.shopFor("Samsung PC");

        // can use amazonHomepage object to reach ProductPage  shopFor method? == > no I can not
        ProductPage productPage = new ProductPage("Chrome" , 2);
        productPage.shopFor(amazonHomepage.product); // parantez icine [amazonHomepage.shopFor("Samsung PC");] cagirdik yani

        // navigate to Cart: I can use both objects
       // productPage.navigateTo("Cart"); //we can use as well child class object
        amazonHomepage.navigateTo("Cart");

        CartPage cartPage = new CartPage("Chrome", " Mike Smith");
        cartPage.fillInfo();
        cartPage.payFor(3456789098765l);

        cartPage.setNmae("Firefox"); //There is already an open browser : Chrome

        cartPage.closeBrowser();

        cartPage.setNmae("Firefox");
        System.out.println("I am automating : " + cartPage.getName());
        /*
        normal da suan browser name hepsinde bas tan assaga chrom olmali
        ama bir yerde hata var diyor oscar onun icin olmuyor
         */

        System.out.println("I am automating : " + amazonHomepage.getName());

        /*
        private static String browserType; // hatamiz da bu
        bunu en basta Browser class da static olarak tanimlalmamis iz
         */


    }
}

/*
  Let's create a Test Case together:
      1. I need to set my browser and OS type
      2. Navigate to App's Page
      3. navigate to laptops and select Samsung PC
      4. Go to product's page, buy 2 of them, add to cart
      5. Go to cart, fill all the fields and order
      6. Check the amount and prices are as expected

 */
