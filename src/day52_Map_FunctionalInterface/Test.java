package day52_Map_FunctionalInterface;

public class Test {

    // lambda: () -> {}

    // normalde () parentez siz kullananiliriz
    // ama eger FunctionalInterface de ki method u muz da parentez in icin de birden fazla deger varsa (yani one parameter) hata verecek
    // yada FunctionalInterface de ki method u muz da parentez in icin de ki deger bos ise yine hata verecek
    // void apply(int n); bu ==> FunctionalInterface de ki method u muz
    // void apply(int n, int z) ==> parentez olamdiginda hat vercek
    // void apply() ==> parentez olamdiginda hat vercek
    // {} icinde one statement oldugu icin curly brasses olmadan yazabiliriz kodu
    // {} zaten curly brasses 'lar in rengi gri bu java da zorunlu degil demek


    public static void main(String[] args) {

        //function1: create a function that can display a number is odd or even
        MyFirstFunctionalInterface oddOrEvenNumber = (n) -> {  // bu "n" yazdimiz yere herhangi birsey yazabiliriz
            if (n%2==0){
                System.out.println(n + " is even number");
            }else{
                System.out.println(n + " is odd number");
            }
        };

        oddOrEvenNumber.apply(20);


        System.out.println("------------------------------------------------------------");
        //function2: create a function that can check if a person is eligible to buy alcohol
        MyFirstFunctionalInterface eligibleToBuyAlcohol;

        eligibleToBuyAlcohol = (age) -> {
            if (age >= 21){
                System.out.println("Eligible to buy alcohol");
            }else {
                System.out.println("Not eligible to buy alcohol");
            }
        };

        eligibleToBuyAlcohol.apply(100);


        System.out.println("------------------------------------------------------------");
        //function3: create a function that can display the cube of a number
        MyFirstFunctionalInterface cube;

        cube = (n) -> {
            System.out.println(n*n*n);
        };

        cube.apply(3);


        System.out.println("------------------------------------------------------------");
        //function4: create a function that can check if a number is evenly divisible by  3 & 5
        MyFirstFunctionalInterface divisibleBy3And5 = n -> {
            if (n % 15 == 0){
                System.out.println(n + " is divisible by  3 & 5");
            }else {
                System.out.println(n+ " is not divisible by  3 & 5");
            }
        };

        divisibleBy3And5.apply(30);


    }
}
