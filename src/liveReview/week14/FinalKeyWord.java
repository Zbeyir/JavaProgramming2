package liveReview.week14;

import java.util.ArrayList;

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

        // Final Arrays

        final int[] nums = {1,2,3};
        System.out.println(nums[0]);
        nums[0] = 5;
        System.out.println(nums[0]);

         // nums = new int[] {5,6,7}; // we can not assign a new array object to our array reference variable

        // Final Arraylist
        final ArrayList<String> colors = new ArrayList<>();

        colors.add("Orange");
        colors.add("Red");

        colors.remove(0);

       // colors = new ArrayList<>(); // ==> Error

        // What si becoming final :
        // final key word is used for 'Variable'



    }
}
