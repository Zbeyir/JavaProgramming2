package day41_Exceptions;

import practice.day_39Practice.studentTask.Student;

import java.io.FileInputStream;

public class checked_vs_Unchecked {

    public static void main(String[] args) {

        // unchecked exceptions:

        int a = 10;
        int b = 0;

        //  System.out.println(a / b);

        //  System.out.println("Wooden Spoon"); // yukarudaki hata verecegi icin run da bunu da alamiyacgiz

        char[] characters = {'A', 'B', 'C'};

        //  System.out.println( characters[99] );


        Student student = null;

        // System.out.println(student.getName());
       // student.study();

        final String str = "Wooden Spoon";

        // str = null;
        /*
        normal de bunu yazdgimiz icin assgidaki sonu cu alamiycaktik
        ama daha sonra final key word u kullandik ve hata cikmasi önlendi
         */


        //System.out.println( str.toUpperCase() );


        String str2 = "";  // object != null

       // str2 = null;

        System.out.println(str2.isEmpty());



        // Checked Exceptions:

        System.out.println("Hello");

       //   Thread.sleep(3000);

        System.out.println("Cydeo");

       // FileInputStream file = new FileInputStream("path of the file");


    }
}
