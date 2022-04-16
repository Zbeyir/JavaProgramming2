package practice.day_39Practice.animalTask;

public class Dog extends FriendlyAnimal {

    public Dog(String name, String breed, String size, String color, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, size, color, age, gender, isWild, isFriendly, isPlayable);
    }

    public void bark(){
        System.out.println( getName() + " "+ getBreed() + " is barking");
    }


}
/*
4. Create the following sub classes of FriendlyAnimal and Override the eat method
			1. Dog:
					Extra methods:
						bark()
 */