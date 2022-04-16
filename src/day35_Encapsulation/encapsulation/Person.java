package day35_Encapsulation.encapsulation;

public class Person {

    private String name;
    private int age;

    // getter return method u kullanir
    public String getName() {
        return name;
    }

    // setter method void methodu kullanir
    public void setName(String name) {   // bunun icindeki parametrenin  yukari ile uyusmasi lazim, ama bu zorunlu degil yani icini bos birakabiliriz
        this.name = name;
    }

//mesela bunlara static yazarsak hata verir

    public int getAge(){
        return age;
    }


    public void setAge(int age){
        if (age <= 0 || age >= 150){
            System.err.println("Invalid Age: " + age);
            System.exit(1); // ===> veya buraya return yazip da cikabilirdik
        }


        this.age = age;
    }
/*
iste su son yaptigimiz privat data nin in avantajini gösteriyor vereablie kontrol edebiliyoruz
private means: you have own control
 */


}
