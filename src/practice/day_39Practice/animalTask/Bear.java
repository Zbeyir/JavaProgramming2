package practice.day_39Practice.animalTask;

public class Bear extends WildAnimal {

    public Bear(String name, String breed, String size, String color, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, size, color, age, gender, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println("Bear " + getBreed() + " is hunts fish");
    }

}
/*
5. Create the following sub classes of WildAnimal and Override the hunt method, and add any extra methods that are needed:
				1. Lion
				2. Tiger
				3. Eagle
				4. Bear
				5. Python
				6. Crocodile
 */