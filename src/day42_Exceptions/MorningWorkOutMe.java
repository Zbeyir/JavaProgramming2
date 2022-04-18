package day42_Exceptions;

public class MorningWorkOutMe {

    public static void main(String[] args) {

        System.out.println("--------------------Push up started-------------------");

        for (int i = 1; i <= 30 ; i++) {

            System.out.print("\rPush up " + i);

            sleep(1.5);
        }

        System.out.println("\n--------------Push ups completed------------");


        System.out.println("--------------------Pull up started-------------------");

        for (int i = 1; i <= 20 ; i++) {

            System.out.print("\rPush up " + i);

            sleep(2.5);

        }

        System.out.println("\n--------------Pull ups completed------------");



    }

    public static void sleep(double seconds){

        try {
            Thread.sleep( (long) (seconds * 1000));  // burada 1000* ile carptik cunku second i loong cevirmek icin, sonra sonucun tamamini (long) CARPTIK
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}

/*
Warmup task:
	MorningWorkOut:
			1. Do 30 push-ups and try pausing 1.5 seconds in each


			2. Do 20 Pull-ups and try pausing 2.5 seconds in each

 */