package liveReview.Week12;

public class Microsoft {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        // bu regular yol --- bu sefer baska yol

        System.out.println(employee1.toString());
        employee1.name = "Melte";
        employee1.jobTitle = "SDET";
        employee1.ID = 123;
        employee1.salary = 250000;
        System.out.println(employee1.toString());


        System.out.println("-------------------------------");

        Employee[] testers = {
                new Employee("Yasin", "SDET", 123, 150000),
                new Employee("Erol", "QA Lead", 101, 170000),
                new Employee("Rumeysa","QA Engineer",232,12000),
                new Employee("Dilek","SDET",134,155000)
        };


        //let find max salary
        double maxSalary = Double.MIN_VALUE;
        for ( Employee each : testers){
            System.out.println(each.toString());

            // each is reference for our objects created inside the array
            if (each.salary > maxSalary){
                maxSalary = each.salary;
            }
        }

        System.out.println("maxSalary = " + maxSalary);
        System.out.println(testers[0].name);

    }
}
