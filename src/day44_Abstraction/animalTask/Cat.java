package day44_Abstraction.animalTask;

public final class Cat extends Animal implements Playable {


    public Cat(String name, String size, String breed, String color, char gender, int age) {
        super(name, size, breed, color, gender, age);
    }


    @Override
    public void eat() {
        System.out.println(getName()+" eats Biryani");
    }

    public void meow(){
        System.out.println(getName()+ " is meowing");
    }

    @Override
    public void play() {

    }
}

/*
Cat
					eat(): eats Biryani


 */
