package liveReview.week14.browserPagesInharitance;

public class CartPage extends AmazonHomepage{

    String buyerInfo;

    public CartPage(String name, String buyerInfo) {
        super(name);
        this.buyerInfo = buyerInfo;
    }

    public void fillInfo(){
        System.out.println("Filling the necessary fields with " + buyerInfo);
    }

    public void payFor(long cardNumber){
        System.out.println("Paying with credit card : " + cardNumber);
    }

}
