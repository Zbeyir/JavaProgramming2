package practice.day_39Practice.studentTask;

public class CydeoStudent extends Student {

    public String  programmingLanguage;
    public int batchNumber, groupNumber;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage == null || programmingLanguage.isBlank() || programmingLanguage.isEmpty()){
            System.err.println("Invalid programming language  " + programmingLanguage);
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber <= 0 ){
            System.err.println("Invalid batch number " + batchNumber);
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if (groupNumber <= 0){
            System.err.println("Invalid group number");
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    public CydeoStudent(String name, int age, char gender, String studentId, String fieldOfStudy, String schoolName, char grade, String programmingLanguage, int batchNumber, int groupNumber) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);
       setBatchNumber(batchNumber);
       setGroupNumber(groupNumber);
       setProgrammingLanguage(programmingLanguage);
    }

    @Override
    public void eat() {
        System.out.println( getName() +" is eating hamburger");
    }

    @Override
    public void drink() {
        System.out.println(getName() + " is drinking watter");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping on the bed");
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", studentId='" + studentId + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", grade=" + grade +
                '}';
    }
}

/*
3. Create the following sub classes of Student class:

				3. CydeoStudent:

						Extra Variables:
							batchNumber, groupNumber, programmingLanguage

						Encapsulate all the fields

						Add a constructor that can set all the fields

								Condition:
									1. batchNumber and groupNumber should not be set to zero or negative
									2. programmingLanguage should not be set to null
									3. programmingLanguage should not empty


						Override the eat, drink and sleep methods (programmingLanguage need to be included)

						Override the toString method:
								name, age, gender, studentId, fieldOfStudy, grade, schoolName, batchNumber, groupNumber, programmingLanguage should be included



 */