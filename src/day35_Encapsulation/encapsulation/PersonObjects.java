package day35_Encapsulation.encapsulation;

public class PersonObjects {

    public static void main(String[] args) {

        Person p1 = new Person();
      //  p1.name = "Daniwl"; // burada bu yöntemin imkani yoj cünkü privat
      //  p1.age = 28;

        p1.setName("Daniel");
        p1.setAge(28);

        //System.out.println(p1.name + " : " + p1.age); // buda compelier eror

        System.out.println(p1.getName() + " : " + p1.getAge() );

        System.out.println("----------------------------------");

        Person p2 = new Person();

        p2.setAge(-100);

        System.out.println(p2.getAge());



    }
}
