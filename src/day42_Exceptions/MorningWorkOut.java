package day42_Exceptions;

public class MorningWorkOut {

    public static void main(String[] args) {

        System.out.println("--------------------Push up started-------------------");

        for (int i = 1; i <= 30 ; i++) {

            System.out.print("\rPush up " + i);
            try {
                Thread.sleep(100); // burayi kendimiz degistirdik hizli olsun diye
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println("\n--------------Push ups completed------------");


        System.out.println("--------------------Pull up started-------------------");

        for (int i = 1; i <= 20 ; i++) {

            System.out.print("\rPush up " + i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println("\n--------------Pull ups completed------------");


    }
}

/*
Warmup task:
	MorningWorkOut:
			1. Do 30 push-ups and try pausing 1.5 seconds in each


			2. Do 20 Pull-ups and try pausing 2.5 seconds in each

 */
/*
yukarida ki -----> 1.5 seconds === 1500 Long a esit (cünkü parantez in ici long)
 */