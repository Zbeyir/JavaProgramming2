package day35_Encapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

       Employee employee1 = new Employee("Nalan", 'F',30,110000);

        System.out.println(employee1);

        Employee employee2 = new Employee("", 'F',45,110000);

        System.out.println(employee2);

        Employee employee3 = new Employee("", 'Ö',159,-110000);

        System.out.println(employee3);

        employee3.setName("Haci");
        System.out.println(employee3);

        employee3.setGender('M');
        System.out.println(employee3);

        employee3.setAge(37);
        System.out.println(employee3);

        employee3.setSalary(100000);
        System.out.println(employee3);

        employee3.setSalary(employee3.getSalary() + 15000);
        System.out.println(employee3);


    }
}
