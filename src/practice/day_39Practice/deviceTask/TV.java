package practice.day_39Practice.deviceTask;

public class TV extends Device {

    public TV(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void channelUp(){
        System.out.println(brand + " " + model + " is channel up");
    }

    public void channelDown(){
        System.out.println(brand + " "+ model + " is channel down");
    }

}
/*
4. Create a sub class of Device named TV:

				Extra Methods:
					channelUp()
					channelDown()
 */