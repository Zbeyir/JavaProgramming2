package liveReview.Week15;

import java.util.Scanner;

public class RunTimeErrorExample {

    public static void main(String[] args) {

        System.out.println("Hello"); // mesela bunun sonu na semi kalon ';' koymadigimizda bizi uyarir bu checkedException

        try {
            System.out.println(5/0);
        } catch (Exception e) {
        }

        System.out.println("How are you today ?");
        System.out.println("Some more lines of code ");
        /*
        ve hördün gibi sonuc '0' cikiyor
         */

        int x =5 ;
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();

        try {
            System.out.println(x / y);
        } catch (Exception e) {
        }

        System.out.println("We swallowed the exception object");

        /*
        bu durum da 0 yazin ca elemani yutuyor (swallowed)
         */

    }
}
