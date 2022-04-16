package practice.day_38Practice.animalTask;

public class Tiger extends Animal{


    public Tiger(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("eats deer");
    }
}
/*
3. Tiger
					eat(): eats deer

 */