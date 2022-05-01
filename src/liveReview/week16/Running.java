package liveReview.week16;

public class Running extends Exercise {

    @Override
    public void perform() {
        System.out.println("Performing Running Excessive on Trac");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes*13;
    }

    // public abstract void run(); // you can not your methods as abstract in regular classes

}
