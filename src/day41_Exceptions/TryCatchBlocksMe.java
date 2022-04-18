package day41_Exceptions;

public class TryCatchBlocksMe {

    public static void main(String[] args) {


        System.out.println("Test2 started");

        int[] numbers = {1,2,3,4,5};

        try {

            System.out.println(numbers[200]);

            System.out.println("Try Block");

        } catch (NullPointerException e) {

            System.out.println("Catch Block");

            System.out.println("Null Pointer Exception was occurred");

        }

        System.out.println("Test2 Completed");

    }
}
/*
bu sayfayi kendim actim ;
bu nu test ettigimiz de hata mesaji alacagiz cunkü;
biz parantez icine (ArrayIndexOutOfBoundsException) yazmamiz gerekirken (NullPointerException ) yazdik ve yanlis
bunun önüne gecmek icin (RuntimeException) bunu yaziyoruz cünkü;
bu onlarin hepsinin parent class i
 */
