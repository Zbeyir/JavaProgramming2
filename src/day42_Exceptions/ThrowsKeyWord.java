package day42_Exceptions;

public class ThrowsKeyWord {

    public static void main(String[] args) throws InterruptedException { // (2-) bu hatyi önlemk ve uzun uzun kod yazmamk icin buray bunu yazdik
// (3-) buraya birden fazla Exception ataya biliriz, kolay yolu yine compiler error yani alti kirmizi olan yerde sag tus ve
// ilk üsteki method signature a bas


        System.out.println("-------------Test 1---------------");

        System.out.println("Hello");
        Thread.sleep(3000); // (1-) normalde bu kodu yazdigimiz da hata veriyordu
        System.out.println("Cydeo");

        System.out.println("-------------Test 1 Completed---------------");


        System.out.println("-------------Test 2---------------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Batch 25");

        System.out.println("-------------Test 2 Completed---------------");






    }
}
