package liveReview.week14.browserPagesInharitance;

public class AmazonHomepage extends Browser {  // you CANNOT inherit from final class

    public String product;

    public AmazonHomepage(String name) {
        super(name);
    }

    public void navigateTo(String link){
// normally we will have selenium code but for right now we will just use println to understand inheritance
        System.out.println("Navigeting to " + link + " using " + super.getName()); // sadece getName() de yapabilirdik buda baska bir yolu fark yok
    }

    //final public void shopFor(String product){} compiler error you CANNOT override final methods
    public void shopFor(String product){
        this.product = product;
        System.out.println("Navigating to " + this.product + " 's page");
    }

}
