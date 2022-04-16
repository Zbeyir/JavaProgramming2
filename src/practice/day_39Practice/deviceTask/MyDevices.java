package practice.day_39Practice.deviceTask;

public class MyDevices {

    public static void main(String[] args) {

        Computer computer = new Computer("Mac","SS23",1000,true,true);
        Laptop laptop = new Laptop("Samsung","SMS23",400,true,true);
        Iphone iphone = new Iphone("Iphone","i12",1200,true,true);

        System.out.println(computer.getBrand());
        computer.turnOf();
        computer.turnOn();
        iphone.call(56789);



    }
}


/*
6. Create a class named MyDevices:
			Create the objects of each sub classes and

			test all the functions of each objects

            Analyze the relationships between the classes


 */