package liveReview.Week15;

public class ErrorExamples {

    /*
    normally we don't try to catch ERROR like the one bellow
     */

    public static void main(String[] args) {

        try {
            deathlyMethod();
        } catch (StackOverflowError e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            System.out.println(e.getClass());
        }


    }

    static int counter = 0;
    public static void deathlyMethod(){
        System.out.println(counter++);
        deathlyMethod();   // infinite loop
    }

}
