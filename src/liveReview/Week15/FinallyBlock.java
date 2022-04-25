package liveReview.Week15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println("You entered: " + num);

        } catch (InputMismatchException e) {
            System.out.println("You entered invalid value!");
        }finally {
            scanner.close();
            System.out.println("Finally block - runs always");
        }

    }
}
/*
burada mesela int girmesini istiyor
int num girince sikinti yok
ama mesela double num girince invalid..... cikiyor
ama hem double da hem de in num da finalyy block cikiyor
 */