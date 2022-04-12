package day38_Inheritance.carTask;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Corolla","Black",2018,20000,20000);

        Tesla tesla = new Tesla("Model S","Red",2022,95500,0);

        BMW bmw = new BMW("X5","black",2022,45000,10000);


        toyota.start();
        tesla.start();
        bmw.start();



    }
}
