package day36_Inheritance.encapsulation;

public class Student {

    private String name;
    private int age;
    private char gender, grade;
    private String schoolName;
    // mesela burarada schoolName i static yapmadik cünkü sadece bir okul degil herhangi bir okul



    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }




    /*
    assagida yazdigimiz exses modifaier olarak public yerine hic bir se yazmasak (default)
    yada privat , yada static yazsak bunlarin kullanim alanlari sinirli
     */

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public char getGrade() {
        return grade;
    }

    public String getSchoolName() {
        return schoolName;
    }



    // mesela ici String yerine double olsa idi hata verecekti
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age<5 || age>90 ){
            return;
        }
        this.age = age;
    }

    public void setGender(char gender) {
        if ( !(gender == 'M' || gender == 'F' ) ){
            return;
        }
        this.gender = gender;
    }

    public void setGrade(char grade) {
        if ( !(grade =='A'|| grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F' ) ){
            return;
        }
        this.grade = grade;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(name + " is studying");
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }



}

/*
warmup tasks:
	1. Create a class named Student:
			private variables:
				name, age, gender, grade, schoolName

			Encapsulate all the fileds (at least encapsulate two fields manually)
					requirments:
						1. age should not be set less than 5 or greater than 90
						2. gender should not be set to any chanarcter other than: 'M' and 'F'
						3. grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'

			Add a constructor that can set all teh fields when the object is created
						(requirments of fileds in the above must be applied)


			Methods:
				study()
				toString()


 */