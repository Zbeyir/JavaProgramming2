package day44_Abstraction.animalTask;

public class Dog extends Animal {


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


}
/*
önce bu sinifa ait variable ve method lar i yaziyoruz sonra extends yapip yapilmasi gereknleri kisa yoldan yapiyoruz
ve metdod lar mesela name i name olarak cagiramayiz hata verir burada get.Name() ile cagirabiliyoruz
 */

/*
Dog
					eat(): eats Pizza
 */
