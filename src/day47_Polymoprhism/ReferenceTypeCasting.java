package day47_Polymoprhism;

import day43_Abstraction.employee.*;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Cat;
import day44_Abstraction.animalTask.Dog;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Cube;
import day45_Abstraction.shape.Shape;
import day45_Abstraction.shape.Square;

public class ReferenceTypeCasting {

    public static void main(String[] args) {


        // Shape shape = (Shape) new Circle(4); // upcasting

        Shape shape2 = new Circle(5);

        //WebDriver driver  = (ChromeDriver) new ChromeDriver();

        // Animal animal = (Animal) new Dog("Max", "Small", "Husky", "White",'M',3);
        /*
        ==> yukarida parantez icinde  '(Animal)' yazmaya gerek yok kendi otamatik olara atiyor,
        cünkü büyük ten kücüge giyor,
        ve biz suan 'upcasting' yaptik.

         */

        Animal animal = new Dog("Max", "Small", "Husky", "White", 'M', 3);

        // animal.bark(); // ==> polymorphism is ; we con not called this method

        // Dog dog = animal; // ===> we can not direct assigned

      //  Dog dog2 = new Dog("Max", "Small", "Husky", "White", 'M', 3);

        // Dog dog3 = dog2; // ==> bunu böyle direct assigned yapabiliriz ama yukarida ki aninal NO

     //   Dog dog = (Dog) animal; //downcasting

        // WE MUST use cast operator(...) , because smaller to larger

        System.out.println(animal.getName());
       // System.out.println(dog.getName());

        // animal.bark();
        //dog.bark();

        ( (Dog)animal ).bark();  //==> downcasting ==> best solution



        System.out.println("--------------------------------------");

        Animal animal2 = new Dog("Max", "Small", "Husky", "White", 'M', 3);

        Dog dog1 = new Dog("Lucy", "Small", "Husky", "White", 'F', 3);

        System.out.println(animal2.getName());
        System.out.println(dog1.getName());

       // animal2.bark();
        dog1.bark();

        System.out.println("--------------------------------------");

        Shape shape1 = new Square(5);

       // System.out.println(shape1.getSide()); //==> (2) bak ac bunu gör hata veriyor reis

        System.out.println( ((Square) shape1).getSide() );
        /*
        yani normalde side getirtmiyordu hata veriyordu , biz geitrtik (1)

        böyle yiúkarida ki gibi bir defa kullanacak isiek tanimlamaya gerek yok
        kirmizi olunca sag tusa bas ve ilk önerdigine tikla
         */


        System.out.println("--------------------------------------");

        Animal animal3 = new Cat("Jim","Small" ,"Scottish" , "White",'M' , 3);

        Cat cat = (Cat) animal3; // burada da kisa yolu kullan ==> option(alt) + enter
        cat.meow();

        System.out.println("--------------------------------------");

        Animal animal4 = new Cat("Jim","Small" ,"Scottish" , "White",'M' , 3);

        ( (Cat) animal4 ).meow();  // parantezlere dikkat!!!

       // ( (Dog) animal4 ).bark(); // amma burada kisa yol islemeiyor kendimiz yazdik
/*
amma burada kisa yol islemeiyor kendimiz yazdik
===> because;

There must be IS A (inheritance) relation between the object type and reference
type we are casting it to, otherwise ClassCastException will be thrown

 */


        System.out.println("---------------------------------------------------");

        Employee employee = new Tester("Ali",30,'M',42,"SDET",145000.00);

        ( (Tester) employee ).bugReport(); // downcasting

        // burada kisa yol isliyor,  because is relationship

        // ( (Tester) employee ).unitTest(); // bu sefer compiler erorr verdi

        // ( (Developer) employee ).unitTest(); // bu sefer de castexpection hatasi verdi
        //cünkü tester ve developer arasinda isRelationShip yok (yukarida ayrintili analatiliyor )


       // Driver driver = (Driver) employee;  // line 1 ==>not successfully --> ClassCastException
        /*
        yukariyi
        ==> bak ac calistit ne demek istedigimi nalyican hata verecek
        cünkü yukarida tester olarak tanimladik tester ile driver arasinda is relation shep yokkk

         */
        Person person = (Person) employee; // line2 ==> successfully

       // Teacher teacher = (Teacher) employee; // line 3 ==>not successfully --> ClassCastException

        System.out.println("---------------------------------------------------");

        Shape s1  = new Circle(10);
        s1.area();
        s1.perimeter();

        // ( (Cube)s1 ).volume();  // Circle cannot be cast to class Cube --> ClassCastException
// because does not have isRelationship



    }
}
