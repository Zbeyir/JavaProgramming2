package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test1 started");

        try {
            System.out.println(9/0);

            System.out.println("Try Block");

        } catch (ArithmeticException e) {

            System.out.println("Catch Block");

            System.out.println("Arithmetic Exception was occurred");

        }

        System.out.println("Test1 Completed");




        System.out.println("----------------------------------------");

        System.out.println("Test2 started");

        int[] numbers = {1,2,3,};

        try {

            System.out.println(numbers[200]);

            System.out.println("Try Block");

        } catch (RuntimeException e) {

            e.printStackTrace(); // bu method uzun uzun anlatiyor hatanin nedenini, ileride bu yöntemi daha cok tercih edecekmisiz,
            // cünkü bunda full detay var ve bug fix etmek bunda daha kolay

           // System.out.println(e.getMessage());


        }

        System.out.println("Test2 Completed");


        System.out.println("----------------------------------------");

        System.out.println("Test3 started");

        try {
            System.out.println("Cydeo".substring(2,0));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Test3 Completed");

        System.out.println("----------------------------------------");

        System.out.println("Hello");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Cydeo");


        /*
        mesela yukarudaki  ve assagidaki örnek checked expections ama onu da böyle cathc yapabiliyoruz
        kisa yolu sag tusa bas catch with (2. siradakini sec)
         */
        System.out.println("----------------------------------------");


        try {
            FileInputStream file = new FileInputStream("File Path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
