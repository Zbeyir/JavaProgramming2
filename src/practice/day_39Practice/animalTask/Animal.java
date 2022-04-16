package practice.day_39Practice.animalTask;

public class Animal {

    public String name, breed, size, color;
    public int age;
    public char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name " + name );
            System.exit(1);
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed == null || breed.isEmpty() || breed.isBlank()) {
            System.err.println("Invalid breed " + breed);
            System.exit(1);
        }
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            System.err.println("Invalid color " + color);
            System.exit(1);
        }
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0){
            System.err.println("Invalid age " + age );
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if ( !(gender == 'M' || gender == 'F') ){
            System.err.println("Invalid gender " + gender);
        }
        this.gender = gender;
    }

    public Animal(String name, String breed, String size, String color, int age, char gender) {
       setAge(age);
       setName(name);
       setGender(gender);
       setBreed(breed);
       setColor(color);
       setSize(size);
    }

    public void eat(){
        System.out.println( name +" " + breed + " is eating");
    }

    public void  drink(){
        System.out.println( name +" " + breed + " is drinking");
    }

   public void sleep(){
       System.out.println( name +" " + breed + " is sleeping");
   }

    public  void move(){
        System.out.println( name +" " + breed + " is moving");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

}

/*
Animal Task:
	1. Create a class named Animal:
			variables:
				name, breed, gender, age, size, color

			Encapsulate all the fields

			Add a constructor to set all the fields

					Conditions:
						1. name, breed and color can not be null (if obj == null means it's error)
						2. name, breed and color can not be empty or can not be blank
						3. gender should only be set to either 'M' or 'F'
						4. age can not be set to negative

			Methods:
				eat()
				drink()
				sleep()
				move()
				toString()
 */
