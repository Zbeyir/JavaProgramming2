package day36_Inheritance.animalTask;

public class Dog extends Animal { // Dog Is an Animal
       //   child        parent

    public void bark(){
        System.out.println(name + " is barking");  // gördügün gibi name extends ile buray geldi
    }




/*
     Burasi dog class, animal in child i (cocugu)-- animal parent
     ayni gercek hayat gibi cocuk ailesinin ailesi olamaz
     yani child class Animal in yani parent in parent i olamaz
     yani heerhangi bir child class i parent class ta extends yapamayiz
     her child in bir tane parent i olur, ve her zaman  extends in sol tarafinda olur ve sagindaki parent


 */


}

/*
dog:
   6 variables
   7 methods
 */
