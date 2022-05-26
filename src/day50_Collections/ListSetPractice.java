package day50_Collections;



import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));
        System.out.println(set);

        // Integer[] array = set.toArray(new Integer[0]);

        List<Integer> list = new ArrayList<>( set );

        System.out.println(list);

        List<String> name = null;

       // System.out.println(names.size());  // NullPointerException

        System.out.println("----------------------------------------------");

        //pop() ===> LIFO  ==> bu method sadece Stack 'a özgü
        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A','B','C','D'));

        System.out.println(chars);   //[A, B, C, D]

        ((Stack) chars).pop();

        System.out.println("--After pop() method--");
        System.out.println(chars);  //[A, B, C]

        //poll() ===> FIFO ===> BUDA SADECE linkedList 'e özgü
        List<String> names = new LinkedList<>();
        names.addAll(Arrays.asList("Ali","Osman","Haydar","Cemal","Bekir"));

        System.out.println(names);

        System.out.println("--After poll() method--");

        ((LinkedList<String>) names).poll(); // eger-->LinkedList<String> names = new LinkedList<>();--> bus ekilde tanimlamis olsa idik casting 'e gerek yoktu

        System.out.println(names);

        ((LinkedList<String>) names).poll();
        System.out.println(names);





    }
}
