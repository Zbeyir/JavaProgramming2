package day40_FinalKeyword;

public final class Dog extends Animal { // daha Inheritance yapamayiz bunun artuik


    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food");
    }

    /*public void drink(){
        System.out.println(name + " is drinking beer");
    }

     */
    // final methods can not be overridden

    //it is unnecessarily - mesela burada final yazmak gereksiz cünkü zaten class final ve gördügün gibi rengi ''gri''
    public final void bark(){
        System.out.println(getName() + " is barking");
    }

}

// eating dog food

/*
final class i Inheritance yapamayiz (extends)
child (sub) calss i final yapabiliriz ama parent class i yapamayiz
 */