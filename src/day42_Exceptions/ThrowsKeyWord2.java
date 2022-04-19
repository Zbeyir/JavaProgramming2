package day42_Exceptions;

public class ThrowsKeyWord2 {

    public static void main(String[] args) throws ArithmeticException {

        System.out.println("Test started");

        System.out.println((8/0));

        System.out.println("Test completed");


    }
}
/*
sorun hala cözülmedi cünkü burada try catch yapmaliydik
 because; 2. throws: used for handling checked exceptions ONLY
 */