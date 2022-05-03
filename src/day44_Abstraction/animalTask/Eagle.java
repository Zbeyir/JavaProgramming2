package day44_Abstraction.animalTask;

public final class Eagle extends Animal implements WildAnimal, Flyabale{

    public Eagle(String name, String size, String breed, String color, char gender, int age) {
        super(name, size, breed, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " eats snake");
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " hunts snake");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " can fly 50km/h");
    }

}
/*
Eagle
					eat(): eats snake


 */
