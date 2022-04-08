package day36_Inheritance.animalTask;

public class Cat extends Animal {  // Cat Is an Animal

    public void meow(){
        System.out.println(name + " is meowing");
    }


    public void scratch(){
        System.out.println(name + " is scratching");
    }



    // extends yapsa idik tek tek animal daki tüm herseyi buraya copy paat yapacaktik

}

/*
cat:
   6 variables
   8 methods
 */

