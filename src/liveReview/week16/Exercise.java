package liveReview.week16;

public abstract class Exercise {

    //You don't have to have abstract method at all, and you can still declare your class as abstract

    public void start(){
        System.out.println("warming up and starting the exercise");
    }

    /*
    abstract methods: no body, no implementation, sub classes will ***OVERRIDE***
just have the signature part
less code
     */


    public abstract void perform();

    public abstract int getCaloriesCount(int minutes);


}
