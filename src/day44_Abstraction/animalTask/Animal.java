package day44_Abstraction.animalTask;


/*
class Test {
    public static void main(String[] args) {

        System.out.println(new Test().getClass());  // class day44_Abstraction.animalTask.Test
        System.out.println(new Test().getClass().getName());  // day44_Abstraction.animalTask.Test
        System.out.println(new Test().getClass().getSimpleName()); //

        //bu yönetemi assgida tostring de uyguladik neyin ne oldugunu anlamk icin burada bunu yaoptik
        //karsilarinada anlamn icin neyin neyi getirdigini yazdim

    }
}
*/






public  abstract class Animal {
//mesela bu abstract class i final yapamayiz hata verir
    // cünkü abstract ve final birlikte kullanilamaz



    private String name, size;
    private final String breed, color;
    private final char gender;
    private int age;

    public final static boolean canBreath;

    static {
        canBreath = true;
        // canBreath = false; // mesela bnunu yapamayiz because declared final
    }

/*
!!**setter check the condition!!**
mesela constructor un icinde de 'set' yaptiklramizi 'this' olsa o zaman condition check edemeyiz
ki ben bunu daha önce tecrübe ettim
yada 'final' lar da oldugu gibi constructor un icinde tanimlamaliyim condition ni
final only way variable checked the condition in constructor
 */

    public Animal(String name, String size, String breed, String color, char gender, int age) {
        setName(name);
        setSize(size);
        this.breed = breed;
        this.color = color;
        if ( !(gender =='M' || gender=='F') ){
            throw new RuntimeException("Invalid gender: " + gender);
        }
        this.gender = gender;
        setAge(age);
    }

    // hepsinin getter leri var

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }


    // ama 3 tane setter var
    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()){
            throw  new RuntimeException("Invalid name: " + name);
        }
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //mesela bu abstract method da  final yapamayiz hata verir
    // cünkü günün sonunda ent of the day implementation yapilacak
    // abstract method ve final birlikte kesinlikle kullanilamaz
    public abstract void eat();


    // bu method  private (static or private ) void drink() static olsaydi name ulasamiyorduk.
    // (static or private or final ) de  overriding yapamiyoruz
    // ama mesela burada final kullanabiliriz
    public void drink() {
        System.out.println(name + " is drinking");
    }


    // getClass().getSimpleName() toStirring e  bunu ekeldeik her sinif da kendi adini cagiracak
    // dog da dog, cat de cat
    // yani basinda animal yaziyor du o artik yazmiyacak direkt sinif in adi yazacak
    @Override
    public String toString() {
        return getClass().getSimpleName() +"{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}


/*
Warmup task:
	Animal Task:
		Create an abstract class named Animal:
			Variables:
				name, breed(final), gender(final),  age, size, color(final)

			Encapsulate all the fields

			Add a constructor that can set all the fields

			Methods:
	abstract method===>			eat(); ==> different animals eat different foods
	non - abstract method===>					drink() ==> all the animals drink water
	non - abstract method===>				toString() ==> to display the full info of the animal

******************************
!!! final -----bunlar ikisi birbirinden farkli -----static:
final bir den fazla copy
static only one copy
static degisebilir ama final declare ettigimizde artik degisemez
mesela 'breed - gender - color' de 'final' kullandik cünkü hic bir animal in 'breed - gender - color' i ni degistiremeyiz
******************
 */
