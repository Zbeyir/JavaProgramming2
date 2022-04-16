package practice.day_39Practice.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Husky","Small", "Black", 3,'M',false,true,true);
        Cat cat = new Cat("Leon", "Scotch","Large", "White",4,'F',false,true,true);
        Dolphin dolphin = new Dolphin("Orika", "Orca","Large","Blue",5, 'F', false,true,true);
        Parrot parrot = new Parrot("Cemil","Asia","Medium","Yellow",6,'M',false,true,true);

        Lion lion = new Lion("Aslan","Africa","Xlarge","Black",7,'M',true,false,true);
        Tiger tiger = new Tiger("Kaplan","Asia","Small","Black",9,'F',true,false,true);
        Eagle eagle = new Eagle("Kartal","America","Large","Black",4,'F',true,false,true);
        Bear bear = new Bear("Ayi","North","Large","White",6,'M',true,true,true);
        Python python = new Python("Piton","Indian","XXLarge","Yellow",4,'M',true,true,true);
        Crocodile crocodile = new Crocodile("Timsah","Australian","Small","Green",9,'F',true,false,true);

        dog.bark();
        dog.eat();
        dog.drink();
        dog.move();
        System.out.println(dog);

    }
}

/*
6. Create a class named Zoo:
			Create the objects of each sub classes and

			test all the functions of each objects

            Analyze the relationships between the classes

 */

