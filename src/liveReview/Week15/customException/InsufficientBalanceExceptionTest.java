package liveReview.Week15.customException;

public class InsufficientBalanceExceptionTest {

    public static void main(String[] args) {

        double balance = 395.50;
        double itemPrice = 500.50;

        System.out.println("I have " + balance + " Euros in my account the item is " +itemPrice);

        if (itemPrice > balance){
            throw new InsufficientBalanceException("Transaction declined due to insufficient balance hold");
        }


    }
}
