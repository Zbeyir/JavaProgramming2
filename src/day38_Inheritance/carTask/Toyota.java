package day38_Inheritance.carTask;

public class Toyota extends Car {


    public Toyota(String model, String color, int year, double price, int miles) {
        super("Toyota", model, color, year, price, miles);
    }

    public void reliabile(){
        System.out.println(brand + " "+ model+" is reliable");
    }

    /*
    burasi car class taki ile ayni olacak protected ise protected.
    ama car class taki default sa default ta olur, protected olur, public te.
    ama privat tan private overriding edemeyiz
    soladki cd gibi sey de isareti overriding in
     */

    @Override // this is  optional, you don't give this
    public void start(){
        System.out.println("Twist the key to Ignition " + brand + " " + model );
    }

}

/*
Create the following sub classes of Car:
			1. Toyota:
					extra methods:
							reliabile()
 */