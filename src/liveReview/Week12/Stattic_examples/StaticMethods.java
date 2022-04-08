package liveReview.Week12.Stattic_examples;

public class StaticMethods {

    public int num = 10;

    public static int count = 5;

    public static void displayMessage(String message){
        System.out.println("message = " + message);
       // System.out.println(num); // instance can not be called from static method,
        // ,this num has many copies which one am I gonna print out
        // ==> 2. Static methods CAN NOT reach non-static fields(attributes)
        // burada yukarida "num" static olmadi icin hata veriyor anladin mi:))

        System.out.println("count = " + count);
    }

    public void instanceMethod(){
        System.out.println("instanceMethod");
        System.out.println("count = " + count); // I can call static field from instance method
        // das ist possible---burada olabilir ama digerinde olmuyor

        System.out.println("num = " + num);
        displayMessage("hello from instance method");

    }
    /*
    static method un tek degeri var , ama instance method un bir cok degeri var hangisi yazdirsin.
    Ama static method instance method un icinde de cagirabiliriz yukarida ki gibi
    //displayMessage("hello from instance method");//
     */

}
