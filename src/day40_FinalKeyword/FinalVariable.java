package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;
    final static String name;

    static {
        name = "Batch 25";
    }


    //bu constructor u yapmasa idik hata veriyor du
    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

        double pi = 3.14;

        pi = 4.14;
        pi = 5.4;

        final double pi2 = 3.14;

        // pi2 = 3.55;  // final variable can not be reassigned

         final String name;
        // System.out.println(name);  // compiler error

        name = "Java";
       // name = "Wooden Spoon";  // compiler error

        System.out.println(name);

        System.out.println("---------------------------------------------------------------");

        FinalVariable obj = new FinalVariable("May/01");

        // obj.birthDay = "June/01";  // final variable can not be reassigned

        System.out.println(obj.birthDay);

        System.out.println("---------------------------------------------------------------");

        System.out.println(FinalVariable.name);
         // FinalVariable.name = "python";  // final variable can not be reassigned


    }
}
