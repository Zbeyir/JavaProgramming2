package day38_Inheritance.carTask;

public class Toyota extends Car {


    public Toyota(String model, String color, int year, double price, int miles) {
        super("Toyota", model, color, year, price, miles);
    }

    public void reliabile(){
        System.out.println(brand + " "+ model+" is reliable");
    }


}

/*
Create the following sub classes of Car:
			1. Toyota:
					extra methods:
							reliabile()
 */