package practice.day_39Practice.animalTask;

public class Cat extends FriendlyAnimal {

    public Cat(String name, String breed, String size, String color, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, size, color, age, gender, isWild, isFriendly, isPlayable);
    }

    public void scratch(){
        System.out.println(getName() + " " + getBreed() + " is scratching");
    }

    public void meow(){
        System.out.println(getName() + " " + getBreed() + " is meowing");
    }


}
/*
4. Create the following sub classes of FriendlyAnimal and Override the eat method


			2. Cat:
					Extra methods:
						scratch()
						meow()

 */