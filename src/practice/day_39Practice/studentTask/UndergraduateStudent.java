package practice.day_39Practice.studentTask;

public class UndergraduateStudent extends Student {

    public UndergraduateStudent(String name, int age, char gender, String studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);
    }

    @Override
    public void study() {
        System.out.println(getName() + " is studying .......");
    }

}

/*
3. Create the following sub classes of Student class:


				2. UndergraduateStudent

						Override the study method

						add any additional fields and methods if necessary

 */
