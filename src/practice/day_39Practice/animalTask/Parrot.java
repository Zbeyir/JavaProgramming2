package practice.day_39Practice.animalTask;

public class Parrot extends FriendlyAnimal {

    public Parrot(String name, String breed, String size, String color, int age, char gender, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, size, color, age, gender, isWild, isFriendly, isPlayable);
    }

    public void fly(){
        System.out.println(getName() + " " + getBreed() + " is flying");
    }

    public void sing(){
        System.out.println(getName() + " " + getBreed() + " is singing");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " " + getBreed() + " is eating parrot food");
    }


}
/*
4. Create the following sub classes of FriendlyAnimal and Override the eat method


			4. Parrot:
					Extra methods:
						fly()
						sing()
 */