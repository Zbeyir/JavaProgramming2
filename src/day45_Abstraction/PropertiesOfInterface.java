package day45_Abstraction;

public interface PropertiesOfInterface {

    int a =100; // ama bunu int a; olarak tanimlamayiz ==> static & final by default

    static int b = 200; // bunu da  static int b; olarak tanimlamayiz ==> final by default


    /*
    public PropertiesOfInterface(int a) {



        this.a = a;
    }
    */

   /*
    static {
        b=100;
    }

    */

   /*
    public void method1(){
        System.out.println("Instance method");
    }
     *** no variable means no Instance method
    */

    public static void method2(){
        System.out.println("static method");
    }

    public abstract void method3();


    //default sildigimiz de hata verecek , ccünkü silince instance methoda dönecek
    public default void method4(){
        System.out.println("Default method");
    }

    // toString method u da yazamayiz cünkü oda instance method



}

class Test implements PropertiesOfInterface{

    @Override
    public void method3() {


    }

    public static void main(String[] args) {

        new Test().method4();
    }

}
