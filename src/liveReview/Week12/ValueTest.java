package liveReview.Week12;

public class ValueTest {

    public static void main(String[] args) {

        Value value1 = new Value();

        System.out.println(value1.calledMethod);

        value1.setValue(5);

        System.out.println(value1.calledMethod);


    }
}
