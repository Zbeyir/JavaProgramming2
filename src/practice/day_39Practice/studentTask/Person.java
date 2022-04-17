package practice.day_39Practice.studentTask;

public class Person {

    public String name;
    public int age;
    public  char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ( name == null || name.isEmpty() || name.isBlank() ) {
            System.err.println("Invalid name " + name);
            System.exit(1);

            char[] chars = name.toCharArray();
            for (char each : chars) {
                if ( !( Character.isLetterOrDigit(each) ) ){
                    System.err.println("Invalid name " + name);
                    System.exit(1);
                }
            }

        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0 ){
            System.err.println("Invalid age " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if ( !(gender == 'M' || gender == 'F') ){
            System.err.println("Invalid gender " + gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
      setName(name);
        setAge(age);
        setGender(gender);
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void drink(){
        System.out.println(name + " is drinking");
    }

   public  void sleep(){
       System.out.println(name + " is sleeping");
   }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

}

/*
Student Task:
	1. Create a class named Person:
			Variables:
				name, age, gender

			Encapsulate all the fields

			Add a constructor that can set all the fields

					Condition:
						1. name should not be set to null
						2. name should not be empty
						3. name should not contain any special character other than space
						4. age should not be set to negative
						5. gender must be valid

			Methods:
				eat()
				drink()
				sleep()
				toString()

 */
