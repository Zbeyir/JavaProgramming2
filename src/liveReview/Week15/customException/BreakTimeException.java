package liveReview.Week15.customException;

public class BreakTimeException extends RuntimeException {

    public BreakTimeException(String message) {
        super(message); // call the constructor of RuntimeException
    }
}
