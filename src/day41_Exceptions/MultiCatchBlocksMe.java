package day41_Exceptions;

import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlocksMe {

    public static void main(String[] args) {


        Employee employee = null;

        System.out.println("Test Started");

        try {
            System.out.println(employee.getName());


        } catch ( NullPointerException e) {
            System.out.println("First catch blocK");
            e.printStackTrace();

        }catch (ArithmeticException e ){
            System.out.println("Second catch blocK");
            e.printStackTrace();

        }catch (ClassCastException e){
            System.out.println("Third catch blocK");
            e.printStackTrace();

        }catch (IndexOutOfBoundsException e){
            System.out.println("Fourth catch blocK");
            e.printStackTrace();

        }catch (RuntimeException e ){
            System.out.println("Fifth catch blocK");
            e.printStackTrace();
        }

        System.out.println("Test Completed");


    }
}

/*
Balik birtane kac tane avci olursa olsun biri ancak baligi yakalayacak
muhtar in yaptiginda sonuncu (RuntimeException) yakaladi
benim kinde (RuntimeException) yine sonda olmasina ragmen
ilk tam direk adres olani yakaladi (NullPointerException)
*****
Eger parent Expections i yani (RuntimeException) child Expections larin üstünde ki herhangibir siraya
yazarsam hata verir.
yani parent Expections her daim child Expetions tan sonra gelir
 */