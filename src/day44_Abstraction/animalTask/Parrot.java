package day44_Abstraction.animalTask;

public final class Parrot extends Animal implements Palyable, Flyabale{

    public Parrot(String name, String size, String breed, String color, char gender, int age) {
        super(name, size, breed, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " eats chocolate");
    }

    @Override
    public void play() {

    }

    @Override
    public void fly() {
        System.out.println(getName() + " can fly 20km/h");
    }


}
/*
Parrot
					eat(): eats chocolate

 */