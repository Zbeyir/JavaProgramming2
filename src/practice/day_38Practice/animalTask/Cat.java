package practice.day_38Practice.animalTask;

public class Cat extends Animal {


    public Cat(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println( name +"eats cat food");
    }

}
/*
	2. Create the followin sub classes of Animal and override the eat method:
			1. Cat
					eat(): eats cat food

 */