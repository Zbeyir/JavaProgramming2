package day46_Polymorphism;

import day39_Recap.shapeTask.Circle;
import day39_Recap.shapeTask.Rectangle;
import day39_Recap.shapeTask.Shape;
import day39_Recap.shapeTask.Square;
import day43_Abstraction.employee.*;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Dog;
import day44_Abstraction.animalTask.Playable;
import day45_Abstraction.shape.Triangle;

import java.util.ArrayList;

public class PolymorphismIntro {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        Integer n1 = 2;

        Double n2 = 5.5;

        Boolean r1 = true;

        // String[] array = {str, n1, n2, r1};
// bu yukaridaki String leri ancak kabul eder digerlerini kabul etmez ve hata veriyor
// bütün hepsinin parent i lazim oda ==>Object


        Object [] array = {str, n1, n2, r1 , new Circle(4), new Square(5)};

        // yukarida görduügün gibi ---> Object class could be everything (hersey olabilir)
        // car veya baska birsey fark etmez


        /*
        Tester tester = new Tester("Ali",30,'M',42,"SDET",145000.00);
        Developer developer = new Developer("Alex",28,'M',32,"Web Developer",155000.00);
        Teacher teacher = new Teacher("Angel",28,'F',22,"English Teacher",85000.00);
        Driver driver = new Driver("Jhon",34,'M',42,"Lyft Driver",75000.00);

         */

        /*
        ArrayList <Tester> cydeoEmployees = new ArrayList();
        cydeoEmployees.add(tester);
        cydeoEmployees.add(developer);
        cydeoEmployees.add(teacher);
        cydeoEmployees.add(driver);

        #### nu yukarida ki gibi olursa sadece tester i accepted  ekleyebiliyoruz
        yada bu durumda assagidaki Developer yerine Tester yazacaz o zamanda hata verecek

         Tester developer = new Developer("Alex",28,'M',32,"Web Developer",155000.00);

         cünkü arasinda bir iliski yok
         ikisi de child class
         */

        Employee tester = new Tester("Ali",30,'M',42,"SDET",145000.00);
        Employee developer = new Developer("Alex",28,'M',32,"Web Developer",155000.00);
        Employee teacher = new Teacher("Angel",28,'F',22,"English Teacher",85000.00);
        Employee driver = new Driver("Jhon",34,'M',42,"Lyft Driver",75000.00);


       // ArrayList <Employee> cydeoEmployees = new ArrayList();  //==> BU DA OLUR BU IKISIDE OLUR
        ArrayList <Person> cydeoEmployees = new ArrayList();  //==> BU DA OLUR BU IKISIDE OLUR

        cydeoEmployees.add(tester);
        cydeoEmployees.add(developer);
        cydeoEmployees.add(teacher);
        cydeoEmployees.add(driver);


        System.out.println("-------------------------------------------------------------");

        Employee employee = new Tester("Ali",30,'M',42,"SDET",145000.00);
        employee.work();

        /*
         Employee employee = new -------- bu alan testter yazarsak tester calisyor
         ----developer yazarsak developar calisyor-----bunu gibi devam ediyor
         */

/*
?????????????
      override edilmis olan methodlar  sanki burada calisiyor, edilmemis olanlar degil?????????????
???????
    #######   CEVABI GELDI ALTTA  #########
 */

        // employee.bugReport();
  // Polymorphism de önemli bir kural parent class i (refrains type accessible) i refrans alir burada parent class employee


        Animal animal = new Dog("Max", "Small", "Husky", "White",'M',3);

        animal.drink();
        animal.eat();
        //animal.play();
        //animal.bark();

        // burada bu ikisi ni kabul etmiyor hata veriyor cünkü animal i baz aliyor ,
        // burad dog u baz almiyor, dog sinifina özel olanlarin bir hükmü yok suan


     Playable animal2 = new Dog("Max", "Small", "Husky", "White",'M',3);
        System.out.println(animal2.isFriendly);
        animal2.play();
        //animal2.drink();
        //animal2.eat();

        // burada da bu ikisini kabul etmiyecek cünkü Playable i baz aliyor

        System.out.println("------------------------------------------------------");

        Shape shape = new Circle(5);
        System.out.println("shape.area() = " + shape.area());

        Shape shape1 = new Square(4);
        System.out.println("shape1.area() = " + shape1.area());

        /*
        ama burada da Circle yada Square özgü olna seyleri cagirp kullanamayacagiz
        assagida ki gibi
         */

        //System.out.println(shape.getRadius());
        //System.out.println(shape.PI);


        boolean isSquare = shape instanceof Square; // false
        boolean isSquare1 = shape1 instanceof Square; // true
        boolean isRectangle = shape instanceof Rectangle; // false
       // boolean isTriangle = shape instanceof Triangle;
        boolean isCircle = shape instanceof Circle; // true


        System.out.println("isRectangle = " + isRectangle);
        System.out.println("isSquare = " + isSquare);
        System.out.println("isCircle = " + isCircle);
        System.out.println("isSquare1 = " + isSquare1);

        /*
        2 true iki false var cünkü true olanlar yukarida tanimlandi digerleri tanimlanmadi

        Shape shape = new Circle(5);
         Shape shape1 = new Square(4);
         */

        /*
         WebDriver driver:
            if(driver instanceof Chrome){
                Chrome browser will open
            }else if(driver instanceof firefox){
                Firefox browser will open
            }
            ........
         */



    }
}
