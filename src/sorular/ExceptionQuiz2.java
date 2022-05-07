package sorular;

public class ExceptionQuiz2 {

    public static void main(String[] args) {

        try{
            throw new ArithmeticException();
        }catch (NullPointerException e){
            System.out.println(" 1");
        }catch (RuntimeException e){
            System.out.println(" 2 " );
       // }catch (ArithmeticException e){  // burada bunu buraya yazamayiz --RuntimeException-- bunun altinda olamaz
            System.out.println(" 3" );
        }


    }
}
