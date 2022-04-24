package liveReview.Week15;

public class CheckedExceptionDemo {

    public static void main(String[] args) throws InterruptedException {

        //1. Ty catch

        try {
            Thread.sleep(5000);  //  == 5 seconds
        } catch (InterruptedException e) {

        }
        System.out.println("I will move on with my web automation");


        // 2. Declare using the Throws Keyword

        Thread.sleep(5000);
        System.out.println("mORE automation after 5 more secods");


    }
}
