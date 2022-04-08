package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky","Smal","Black",'M',2);

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
       // dog.hunt();  ===> bunu burada kullanamayiz cünkü tiger in
       // dog.scratch(); ===> buda cat in



        Cat cat = new Cat();
        cat.setInfo("Leon","Skotch","White","Small",'F',3);

        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        cat.scratch();
        cat.meow();
       // cat.bark();  //bunu burada kullanamayiz cünkü dog in



        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan","Bengal","Large","Orange",'M',5);

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();
        tiger.roar();
        tiger.hunt();
       // tiger.meow();   //bunu burada kullanamayiz cünkü dog in





    }
}
