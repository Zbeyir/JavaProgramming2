package day43_Abstraction.car;

// burasi extends den sonra alti kirimizi oluyor hata verioyr
// cünkü constructor ve abstract olan methodlar override yapilmali
//parent class ta tanimlanan abstractlar sub class da bitrilmeli(tamamlanmali yani)
public class Honda extends Car {


    public Honda(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Twis the key to ignition");
    }
}
