package day42_Exceptions;


class FadyException extends RuntimeException{

    public FadyException(String message) { // burada constructor yapmaz isek assagida sag tarafta aciklama alamayiz
        super(message);                     // ve super key word kullanmaliyiz
                                           //custom checked exception
    }

    public FadyException() {
        super("Time for a short break");
    }
}

class NoBreakException extends Exception{ //custom checked exception
    // cheked exception oldugu icin bu method u cagirinca asssagida try catch yaptik


}


public class CustomExceptions {

    public static void main(String[] args) {

       // throw new FadyException();

      //  throw new FadyException("It's time for lunch");

        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }


    }
}
