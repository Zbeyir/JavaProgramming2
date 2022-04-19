package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantageOfThrowsKeyWord2 {

    public static void main(String[] args) throws InterruptedException { //Exception
        // yukariya sadece bunlarin hepsinin parent class i olan Exception u yazabiliriz ama mantikli degil

        method1();
        method2();
        method3();

        String str = null;

        try {
            System.out.println(str.charAt(0));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }


    }

    public static void method() {

        try {
            method1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public static void method1() throws InterruptedException {

       Thread.sleep(1000);

    }

    public static void method2() throws InterruptedException {

        method1();

    }

    public static void method3() throws InterruptedException {

        method2();
        Thread.sleep(1000);

    }

    public static void method4() throws InterruptedException {

        method3();

    }




}

/*
her defasinda throws key word u cagirdik
dolayisiyla utility class kurar iken en matiklisi tyr catch
yukaruda method class ta yaptigimiz gibi en üst te ki
***
universal solution is handling any exceptions try catch
 */