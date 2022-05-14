package day47_Polymoprhism;

public class InheritanceReview {

    int a;
//==> aha da burasi (int a) dolu oldugu icin default constructor degil, default constructor () böyle bos olur
    // ve o zaman otamtik kendini cagir, ama busefer biz assagida child class lar da hepsini manuel olarak cagirdik
    public InheritanceReview(int a) {
        System.out.println("Parent class constructor");
    }

    void method1(){

    }


}



class A extends InheritanceReview{

    public A(int a) {
        super(a);
    }
}

class B extends InheritanceReview{

    public B(int a) {
        super(a);
    }
}

class C extends InheritanceReview{

    public C(int a) {
        super(a);
    }
}



class Aa extends A{

    public Aa(int a) {
        super(a);
    }
}

class Bb extends B{

    public Bb(int a) {
        super(a);
    }
}

class Cc extends C{

    public Cc(int a) {
        super(a);
    }
}



class D {
    void m(){
        super.toString(); // Object class
    }
}
