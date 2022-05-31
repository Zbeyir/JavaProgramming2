package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class BuildInFunctionalInterfaces1 {

    public static void main(String[] args) {

        Predicate<String> isPalindrome = (p) -> {
            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);
        };


        boolean result1 = isPalindrome.test("Java");

        System.out.println(result1);

        System.out.println("==========================================================");

        Predicate<Integer> isEven = p -> p % 2 == 0;

        System.out.println(isEven.test(12));

        System.out.println("==========================================================");

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3));

        //list.removeIf( (p) ->{ return p%2==0; } );  // ==> bunu yazabiliriz
       // list.removeIf( p -> p%2==0 );  // ==> bunu da yazabiliriz
        list.removeIf(isEven);  // ama bana en cok mantikli ve kolay gelen bu

        System.out.println(list);

        System.out.println("==========================================================");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Level","Anna","Java","Python"));

        names.removeIf(isPalindrome);

        System.out.println(names);



    }
}
