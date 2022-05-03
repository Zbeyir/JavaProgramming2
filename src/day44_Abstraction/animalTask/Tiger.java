package day44_Abstraction.animalTask;

public final class Tiger extends Animal implements WildAnimal {


    public Tiger(String name, String size, String breed, String color, char gender, int age) {
        super(name, size, breed, color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats deer");
    }


    @Override
    public void hunt() {
        System.out.println(getName() + " hunts deer");
    }
}

/*
Tiger
					eat(): eats deer


 */