package day37_Inheritance.phoneTask;

public class Iphone extends Phone {


    public Iphone(String model, String size, String color, double price) { // burada da tabi String brand i sildik
       // super(brand, model, size, color, price);
        super("Apple", model, size, color, price); //==> böykece tüm Iphone larda  apple yazmama gerek yok
    }


    public void faceTime(long phoneNumber){
        System.out.println(brand+ " "+ model+ " "+ " is having a Face Time with phone number: "+ phoneNumber);
    }


    public void faceTime(String email){
        System.out.println(brand+ " "+ model+ " "+ " is having a Face Time with email: "+ email);
    }





}

/*
 1.2 Create a subclass of Phone named IPhone:
                Variables:
                    brand, model, size, price, color
                Methods:
                    call(long phoneNumber)
                    text(long phoneNumber)
                    faceTime(long phoneNumber)
                    faceTime(String email)
                    toString()

 */