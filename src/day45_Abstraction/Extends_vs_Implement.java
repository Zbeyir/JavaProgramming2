package day45_Abstraction;


// extends :


class C{

}

class A{

}

class  B extends A {

} // ama ayni anda baska class extends yapamaz... sadece bir class

interface Z{

}

interface Y{

}

interface X extends Y , Z{

}  // AMA burada birden fazla interface i extends yapabiliriz


// implements :

class D implements X,Y,Z{

}


public class Extends_vs_Implement extends A implements X, Y, Z {

}

// SIRALAM bu sekilde olacak yoksa hata verir once extends , sonra implements
