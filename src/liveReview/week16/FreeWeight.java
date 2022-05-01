package liveReview.week16;

public class FreeWeight extends Lifting {

    // How many methods does this class have to implement

    @Override
    public void perform() {
        System.out.println("Lifting Free Weight with dumbbells");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes; // (int) (minutes*6*(weight/100));
    }

    @Override
    public void endLift() {
        System.out.println("Carefully re-rack dumbbells");
    }

    // How many methods does this class have to implement
}
