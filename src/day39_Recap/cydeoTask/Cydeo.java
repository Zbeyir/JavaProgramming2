package day39_Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {

        Developer developer = new Developer("Korkmaz",34,'F',122345,"Java Developer ",120000);

        Tester tester = new Tester("Cetin",44,'M',345,"SDET",100000);

        Teacher teacher = new Teacher("Daniel",32,'M',345,"Math Teacher",80000);

        Student student = new Student("Suhai", 18,'M',45,"SDET");

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("----------------------------------------------------------");

        developer.setAge(29);
        System.out.println(developer.getAge());
        System.out.println(developer);

        System.out.println("----------------------------------------------------------");

        developer.work();
        tester.work();
        teacher.work();
        // student.work(); // buna inharitence yapilmadi bunda bu tanimli degil onun cicn hata verir

        System.out.println("----------------------------------------------------------");

        developer.eat();
        developer.drink();
        developer.sleep();

        developer.fixingBugs();

        System.out.println("----------------------------------------------------------");

        tester.eat();
        tester.drink();
        tester.sleep();

        tester.createTicket();

        System.out.println("----------------------------------------------------------");

        teacher.eat();
        teacher.drink();
        teacher.sleep();


        System.out.println("----------------------------------------------------------");

        student.eat();
        student.drink();
        student.sleep();

        student.study();




    }
}
