package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantageOfThrowsKeyWord2 {

    public static void method() {

        try {
            method1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


    public static void method1() throws FileNotFoundException {

        new FileInputStream("");

    }

    public static void method2() throws FileNotFoundException {

        method1();

    }

    public static void method3() throws FileNotFoundException, InterruptedException {

        method2();
        Thread.sleep(1000);

    }

    public static void method4() throws FileNotFoundException, InterruptedException {

        method3();

    }




}

/*
her defasinda throws key word u cagirdik
dolayisiyla utility class kurar iken en matiklisi tyr catch
yukaruda method class ta yaptigimiz gibi en üst te ki
 */