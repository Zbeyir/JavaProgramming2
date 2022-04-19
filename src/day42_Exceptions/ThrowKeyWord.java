package day42_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyWord {

    public static void main(String[] args) {

        System.out.println("Enter your age:");
        int age = new Scanner(System.in).nextInt();

        if (age < 0 ){
            throw new InputMismatchException("Age can not be negative: " + age);
        }

        if (age > 21){
            System.out.println("You are elegible:");
        }else {
            throw new RuntimeException("You must be at least 21 years old");
        }


    }
}
/*
bu yöntem  System.exit(1); yönteminden daha iyi
cünkü hata oldugu zaman yine exit (1)  yapiyor   ve hata nin hangi satir da oldugunu da söylüyor
 */
