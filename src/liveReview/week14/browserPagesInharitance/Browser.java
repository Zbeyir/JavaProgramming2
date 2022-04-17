package liveReview.week14.browserPagesInharitance;

public class Browser {

    private static String browserType;

    private static String operatingSystem; // windows, androids, IOS, ...

    public Browser(String name) {
        browserType = name;
    }

    static {
        operatingSystem = "Windows";
    }

    public String getName() {
        return browserType;
    }

    public void closeBrowser(){
        browserType = null;
    }

    public void setNmae(String name) { // Our setter method checks if there is already an open browser type before setting a new one.
        if (browserType == null)
        this.browserType = name;
        else
            System.out.println("There is already an open browser : "+browserType);
        // only sets a new one if there is no browser assigned
    }

    public static String getOSName(){
        return operatingSystem;
    }


}

/*
Today's Topics:
    - Inheritance
            * We will try to imitate like we are testing Amazon Web Page Shopping Feature
            - Parent Class : Browser

  OverRiding: When you need more specialized method for the child class you override the method in parent class.
  exp: toString

  Rules for Overriding: (PIQ)
    - there must be IS-A relationship
    - method names must be same (shopFor)
    - same parameter
    - access modifier should be same or more visible
    - Return Type : for primitive it must be same, for object type has to be covariant

  What are the differences between Overloading and Overriding? PIQ

Method Overloading
Method Overriding
Method Hiding (overriding the static methods)

Inheritance Types:
    Single Inheritance: class AmazonHomePage extends Browser
    Multi-Level: class Product Page extends class AmazonHomePage extends Browser
    Hierarchical Inheritance: Product and Cart page extends AmazonHomePage
    Multiple Inheritance ??????? Not possible with regular JAVA classes
    (possible with Interfaces)

Let's create a Test Case together:
      1. I need to set my browser and OS type
      2. Navigate to App's Page
      3. navigate to laptops and select Samsung PC
      4. Go to product's page, buy 2 of them, add to cart
      5. Go to cart, fill all the fields and order
      6. Check the amount and prices are as expected




    - Final Key Word
 */