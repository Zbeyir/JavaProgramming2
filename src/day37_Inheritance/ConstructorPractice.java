package day37_Inheritance;

class A {

    public A(int a){
        System.out.println("A");
    }
}

class B extends A{

    public B() {
        super(9);
        System.out.println("B");
    }
}

public class ConstructorPractice {

    public static void main(String[] args) {

        B obj = new B();



    }
}
/*
class A da int a yi tanimlamsa ididk default class olacakti ve class  B de super keyword u kullanmamiza
gerek kalmiyacakti, kendisi otamatik yapacakti
 */