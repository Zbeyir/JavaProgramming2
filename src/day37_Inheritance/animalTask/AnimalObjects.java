package day37_Inheritance.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {


// burada ki int a yi niye print yaptigim da göremiyorum??????????
        Dog dog1 = new Dog("Max", "Husky", "Smal", "Black", 'M', 2, 1);


        System.out.println(dog1);

        Cat cat1 = new Cat("Leon", "Skotch", "White", "Small", 'F', 3);

        System.out.println(cat1);

        // burada ki en son yazdigimiz String parrotWingColor  yi niye print yaptigim da göremiyorum??????????
        Parrot parrot1 = new Parrot("King", "Macaw", "Small", "Yellov", 'F', 4, "Black");

        System.out.println(parrot1);

        dog1.bark();
        cat1.scratch();
        parrot1.sing();


        /*
        ??????? sorularin cevaplari toString de override yapmayi ögrendigimizde yazdirabilecegiz
         */






    }
}
