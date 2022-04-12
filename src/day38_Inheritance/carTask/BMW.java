package day38_Inheritance.carTask;

public class BMW extends Car{


    public BMW(String model, String color, int year, double price, int miles) {
        super("BMW", model, color, year, price, miles);
    }

    public void breaksDown(){
        System.out.println(brand + " " + model + " breaks down every 100 miles");
    }

    public void racing(){
        System.out.println(brand + " " + model + " is a racing car");
    }

    @Override
    public void start() {
        System.out.println("Call mechanic Jump start " + brand + " " + model);
    }

}
/*
2. BMW:
					extra methods:
						breaksDown()
						racing()


 */
