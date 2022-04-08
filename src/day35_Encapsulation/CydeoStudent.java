package day35_Encapsulation;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age, groupNumber;
    public int batchNumber;
    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;


    public CydeoStudent(String name, char gender, int age, int groupNumber, int batchNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.groupNumber = groupNumber;
        this.batchNumber = batchNumber;
        this.fieldOfStudy = fieldOfStudy;
    }


    static {
        schoolName = "CYDEO";
        programmingLanguage = "JAVA";
        secretCode = "WoodenSpoon";
    }

    public static void printSchoolName(){
        System.out.println("School is " + schoolName);
    }

    public static void printProgrammingLanguage(){
        System.out.println("Language is " + programmingLanguage);
    }

    public static void printSecretCode(){
        System.out.println("code is " + secretCode);
    }

    public void attendClass(){
        System.out.println(name + " is attending class.");
    }

    public void study(){
        System.out.println(name + " is studying.");
    }

    // mesela bu toString() i static yapasak instnace methodlar copmlier eror verecek
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", groupNumber=" + groupNumber +
                ", batchNumber=" + batchNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }



}

/*
2. create a class named CybertekStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */