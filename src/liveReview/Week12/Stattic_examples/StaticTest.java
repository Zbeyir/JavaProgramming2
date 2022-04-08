package liveReview.Week12.Stattic_examples;

public class StaticTest {

    public String instanceValue = "Selenium";
    public static String word = "Java";

    public static void main(String[] args) {

        //System.out.println(instanceValue); // aynen bunu da ciktisini alamayiz cünkü instance

        System.out.println("word = " + word); // bak bu oluyor cünkü static

        // I want to use displayMessage method, do I have to create object? NO

        StaticMethods.displayMessage("Hello static function");

        StaticMethods object = new StaticMethods();
        object.displayMessage("Hello, I am using object to call you");


        System.out.println("-----------------------------");

        //variables
        System.out.println(StaticMethods.count);
        System.out.println(object.count);

        StaticMethods object2 = new StaticMethods();
        System.out.println(object2.num);
        object2.count = 15;

        System.out.println(object.count); // 15  // burasini 5 tanimlamamiza ragmen 15 olarak cikti
        // cünkü son verdigimiz deger gecerli static te
        // ve dikkat object2 iki degil object dahi....

        System.out.println("-----------------------------");
        //call instance method
        //StaticMethods.instanceMethod(); // compiler error

        object.num = 3;
        object2.num = 4;

        object.instanceMethod();  // ama bak yukaridaki mi objectle cagirabiliriz , method ile degil

        object2.instanceMethod();

        // ikisinde hala static field ayni 15





    }
}
