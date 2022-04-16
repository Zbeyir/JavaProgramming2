package practice.employeeTask;

public class Tester extends Employee {

    public Tester(String name, String jobTitle, String salaryName, String comapnyName, int age, int id, char gender) {
        super(name, jobTitle, salaryName, comapnyName, age, id, gender);
    }

    @Override
    public void work() {
        System.out.println(name + " " + jobTitle + " is testing");
    }

}
