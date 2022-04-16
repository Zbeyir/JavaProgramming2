package practice.day_38Practice.animalTask;

public class Dog extends Animal {

    public Dog(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("eats dog food");
    }

}
/*
2. Dog
					eat(): eats dog food

 */