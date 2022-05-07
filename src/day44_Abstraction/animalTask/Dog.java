package day44_Abstraction.animalTask;

public final class Dog extends Animal implements Playable {


    public Dog(String name, String size, String breed, String color, char gender, int age) {
        super(name, size, breed, color, gender, age);
    }

    public void bark(){
        System.out.println(getName() + " is barking");
    }


    @Override
    public void eat() {
        System.out.println(getName() + " eats Pizza");
    }


    @Override
    public void play() {
        System.out.println(getName() + " is playing with ball");
    }


    /* mesela yukarida method u kendimiz manuel olarak override yapsa idik ve access modifier olarak
     ta protected yada default yapamzik hata verir, cünkü ya ayni ya more visibility olmali
     */

}
/*
önce bu sinifa ait variable ve method lar i yaziyoruz sonra extends yapip yapilmasi gereknleri kisa yoldan yapiyoruz
ve metdod lar mesela name i name olarak cagiramayiz hata verir burada get.Name() ile cagirabiliyoruz
 */

/*
Dog
					eat(): eats Pizza
 */
