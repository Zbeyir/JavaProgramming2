package day37_Inheritance.phoneTask;

public class Phone {  // parent class: only contains the common features of all the subclass

    public String brand, model, size, color;
    public double price;

    public static boolean hasBattery;


    public Phone(String brand, String model, String size, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }


    static {
        hasBattery = true;
    }


    public void call(long phoneNumber){
        System.out.println(brand + " "+ model+ " is calling " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(brand + " "+ model+ " is texting " + phoneNumber);
    }


    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price= $" + price +
                ", has Battery= " + hasBattery +
                '}';
    }



}
