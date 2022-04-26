package day43_Abstraction.car;

public class CarShop {

    public static void main(String[] args) {

      //  Car car1 = new Car("Cydeo","25","Blue","2022",100000); // herseyi yazmamimza ragmen hata verdi
// we can not create object from Abstract class, because abstract class is not concerte

        Honda honda = new Honda("Honda","Accord","Black",2019,30000);
        Audi audi = new Audi("Q7","Blue",2020,450000);
        Tesla tesla = new Tesla("Model3","White",2022,60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        honda.setColor("Red");
        audi.setColor("Pink");
        tesla.setColor("Green");

        honda.setPrice(25000);
        audi.setPrice(40000);
        tesla.setPrice(55000);
        // sadece setColor & setPrice cagirip degistirebiliyoruz digerleri (final) sabit
        // the another are unchangeable

        System.out.println("---------------------------------------------------");

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);


    }
}
