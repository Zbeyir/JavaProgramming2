package day36_Inheritance.encapsulation;

public class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student("Nalan",10,'F','A',"MIT");

        System.out.println(student1);

        student1.setAge(19);
        System.out.println(student1);



    }
}
