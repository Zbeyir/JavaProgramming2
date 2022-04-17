package liveReview.week14;

public class FinalKeyWord {

    final int b; // initialization is  mandatory
    final static int c;  // static block yerine buray direkt c= 5; yazabilirdik
    //final int d;  // compiler error
    //d = 10;

    public FinalKeyWord(int b) {
        this.b = b;
    }

    static {
        c = 5;
    }

    public static void main(String[] args) {

        // local variables: if we don't use it, initialization is not mandatory
        final int a;
        a = 100;


    }
}
