package day42_Exceptions;

public class DisadvantageOfThrowsKeyWord {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello");

        sleep(2.5); // throws
        // burada tekrar hata verdi tekrar signatur yaptik bu advantage throws

        System.out.println("Hello World");

        System.out.println("---------------------");

        System.out.println("Hello");

        MorningWorkOutMe.sleep(2.5); // try & catch
        // burada hata vermedi cünkü bu zaten bastan (try & catch) ile yapilmisti

        System.out.println("Cydeo");


/*
throws key word ist fasts way but don't best way
try catch ist best solution
 */
    }

    public static void sleep(double seconds) throws InterruptedException {

        Thread.sleep((long) (seconds * 1000));

    }

}
