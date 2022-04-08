package day37_Inheritance.animalTask;

public class Dog extends  Animal{

    public int a;


    public Dog(String name, String breed, String size, String color, char gender, int age, int a){
        super(name, breed, size, color, gender, age); // bunu ikinci siraya yazamayiz, super yerine baska birsey yazamayiz, baska bir method da da yazamayiz
        this.a = a;
    }
/*
Constructor özel bir method ve ancak tekrar baska bir Constructor ile cagrilabilir
ve burada dog class da yeni ekledigimiz int a gibi datayi this. keyword ile ekliyoruz
 */


    public void bark(){
        System.out.println(name + " is barking");
    }



}
