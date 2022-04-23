package day41_Exceptions;

public class FinallyBlock {

    public static void main(String[] args) {


        int[] arr ={1,2,3};

        try{
            System.out.println(arr[10]);
            System.out.println("Try Block"); // burasi ni cikti olarak alamiyoruz
        } catch (RuntimeException e) {
            System.out.println("Catch block"); // burasinai da yanlis yazarsak (yukarida ki parantez in cicni yani ) cikti olarak alamiyoz
            e.printStackTrace();
          //  System.exit(0); // this only time not executed (sadece bu durumda cikti olarak alamayiz)
        }finally {
            System.out.println("Finally Block"); // ama burasi her durum da yazdirilacaktir
        }


    }
}
