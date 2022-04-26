package day43_Abstraction.employee;

public abstract class Employee extends Person {

    private final int id;
    private String jobTitle;
    private double salary;

    // final i assagida setter yapamiyoruz onun icin kontrolu simdiden constructor un icinde belirledik
    public Employee(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);

        if (id <= 0){
            throw new RuntimeException("Invalid id: " + id);
        }
        this.id = id;
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "id=" + id +
                ", jobTitle='" + jobTitle  +
                ", salary=" + salary +
                '}';
    }


}

/*
mesela bu 2. abstract class da parent i olan employee de ki abstract method olan sleep(); istemedi
 */
