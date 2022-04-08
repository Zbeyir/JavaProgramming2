package day37_Inheritance.animalTask;

public class Cat extends Animal{


    // bunu burada kurmak mendotry yoksa hata veriyor, bizde üstüne basip otamatik kurudurduk
    // bunun da kisa yolu [alt + enter] beraber bas
    public Cat(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }


    public void scratch(){
        System.out.println(name + " is scratching");
    }


}
