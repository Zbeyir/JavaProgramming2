package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
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


        System.out.println("==========================================================");

        Consumer<String> printEach = (s) -> {
            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));
            }
        };

        printEach.accept("Java");


        System.out.println("==========================================================");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,34,5,6,7,8,9));

        /*
        for (Integer each : list2) {
            if (each %2 != 0){
                System.out.println(each);
            }
        }
         */

        System.out.println("each elements");
        list2.forEach( p -> System.out.println(p) );

        System.out.println("each odd numbers");
        list2.forEach( p -> { if(p%2!=0) System.out.println(p); } );


        System.out.println("==========================================================");

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Anel Adilbayeva","Aygun Abbasova Jarullah","Jilili Jiwuer","Ali Ismayilov"));

        employees.forEach(s -> System.out.println(s.charAt(0) + "." + s.charAt(s.lastIndexOf(" ")+1)) );


        System.out.println("==========================================================");


        Function<int[], List<Integer>> convertToList = (a) -> {
            List<Integer> result = new ArrayList<>();
            for (int each : a) {
                result.add(each);
            }
            return result;
        };

        int[] arr = {1,2,3,4,5,6,7,8,9};
        List<Integer> l = convertToList.apply(arr);

        System.out.println(l);

         /*
          cmd + sag tus ile klik methodlarin icine grip bakabiliyorsun
          ve ne istemis veya neye d??nd??r??l??yor girip inceleyebilisin
          mesela yukarida convertToList. yanina aplly yazdik bu apply Function FunctionalInterface den geliyor
          gir bak icine g??r??r??s??n.
    bir de bu Function FunctionalInterface de 2 tane deger girebiliyorsun yukarida ki gi

        @FunctionalInterface
        public interface Function<T, R> {
            R apply(T t);
                 */


        System.out.println("==========================================================");

        Function<List<Integer>, int[]> convertToArray = (a) -> {
            int[] result = new int[a.size()];
            for (int i = 0; i < a.size(); i++) {
                result[i] = a.get(i);
            }
            return result;
        };

        List<Integer> nunbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        int [] result2 = convertToArray.apply(nunbers);

        System.out.println(Arrays.toString(result2));


        // create a function that can return the maximum number from an int array

        // create a function that can swap the first and last elements of an array

        // Create a function that can reverse an array and returns it

        // create a function that can reverse a List





    }

}

/*

 */