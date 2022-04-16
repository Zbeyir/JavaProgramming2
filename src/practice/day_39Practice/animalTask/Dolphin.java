package practice.day_39Practice.animalTask;

public class Dolphin extends FriendlyAnimal {


    public Dolphin(String name, String breed, String size, String color, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, size, color, age, gender, isWild, isFriendly, isPlayable);
    }

    public void swim(){
        System.out.println(getName() + " " + getBreed() + " is swimming");
    }


}
/*
4. Create the following sub classes of FriendlyAnimal and Override the eat method


			3. Dolphin:
					Extra methods:
						swim()

 */