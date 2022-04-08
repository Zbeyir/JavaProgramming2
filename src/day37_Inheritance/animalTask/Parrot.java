package day37_Inheritance.animalTask;

public class Parrot extends Animal{

    public String parrotWingColor;
    // bu extra oldugu icin kendimiz manuel olarak ekliyoruz


    public Parrot(String name, String breed, String size, String color, char gender, int age, String parrotWingColor) {
        super(name, breed, size, color, gender, age);
        this.parrotWingColor = parrotWingColor;
    }

    public void sing(){
        System.out.println(name + " is singing");
    }

}
