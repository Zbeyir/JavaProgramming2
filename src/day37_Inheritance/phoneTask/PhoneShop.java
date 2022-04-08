package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone12","6.7 inches","Black",1000);

        Samsung samsung = new Samsung("Galaxy S19","6 inches","White",900);

        Nokia nokia = new Nokia("Brick","4 inches","Grey",50);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(99923);
        iphone.text(1234566);
        iphone.faceTime(12345667);
        iphone.faceTime("yahoo@gmail.com");

        System.out.println("-------------------------------------------");

        samsung.call(123344);
        samsung.text(123455);
        samsung.freeze();

        System.out.println("-------------------------------------------");

        nokia.call(123323);
        nokia.text(12435);
        nokia.selfDefense();

        System.out.println("-------------------------------------------");

        System.out.println(Phone.hasBattery);
        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);
// en son yaptigimiza büyük harfle class adini yazdik yoksa hasBattery otamatik bulmuyor



    }
}
