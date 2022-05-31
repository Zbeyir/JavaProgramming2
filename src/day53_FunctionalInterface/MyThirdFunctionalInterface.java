package day53_FunctionalInterface;

@FunctionalInterface
public interface MyThirdFunctionalInterface<T> {

    T method(T data);

}

/*
++++++###----bu method yazdigimiz yerin ismi generic olmali sipesifik degil
cube gibi olmamali
apply olabilir mesela

 */

/*
2. Create a Functional interface named MyThirdFunctionalInterface that has an abstract method takes
one argument of any type and returns the same type
 */