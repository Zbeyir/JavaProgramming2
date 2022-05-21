package day49_Collections;

import java.util.*;

public class SetPractice2 {

    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
                "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};

        Set<String> set1 = new HashSet<>(Arrays.asList(arr));

        System.out.println(set1);
        // does not duplicate and order ist random

        arr = set1.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));

        System.out.println("---------------------------------------------------");

        String[] arr1 = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
                "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};

        arr1 = new HashSet<>(Arrays.asList(arr1)).toArray(new String[0]);
        System.out.println(Arrays.toString(arr1));

        System.out.println("---------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000, 300, 1000, 200, 300, 400, 500, 500, 600, 10, 10, 20, 30, 40, 30, 20, 10));
        System.out.println(list);

        // how can I remove the duplicate?

        //list = new HashSet<>(list);  //==> bu sekilde degil
       // list = new LinkedHashSet<>(list);   //==> bu sekilde degil
        //#######---önce ArrayList---####
        list = new ArrayList<>(new LinkedHashSet<>(list));

        System.out.println(list);

        System.out.println("---------------------------------------------------");

        String[] array = {"A", "A", "B", "C"};

        List<String> s = new ArrayList<>();
        s.addAll(Arrays.asList(array));
        s.addAll(Arrays.asList("E", "F", "G"));

        System.out.println(s);

        System.out.println("------------------Another WAY-------------------");
        List<String> s1 = new ArrayList<>( Arrays.asList(array) );
        s1.addAll(Arrays.asList("E", "F", "G"));

        System.out.println(s1);


        System.out.println("---------------------------------------------------");


        /*
        Given:
        Integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
        return the fifth element after removing the duplicates
        Do not change the order of the elements

         */

        Integer[] nums = {1,2,1,1,2,2,2,3,3,3,3,2,3,4,5,1,2,3,4,5,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

        System.out.println(Arrays.toString(nums));

      //  nums = new LinkedHashSet<>( Arrays.asList(nums) ) //==> bu sekilde birakamayir bu ikisi arasinda (isRelationSheep) yok
        //onun icin Any Collection Typ can be converted to Array a

       // nums = new LinkedHashSet<>( Arrays.asList(nums) ).toArray( new Integer[20] );  // ==> bunu yazinca
        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, null, null, null, null, null, null, null, null, null, null]  ==> sonuc böyle cikcak

        nums = new LinkedHashSet<>( Arrays.asList(nums) ).toArray( new Integer[0] ); // en mantiklisi [0] yazmak

        System.out.println(Arrays.toString(nums));


        System.out.println("---------------------------------------------------");

        String str = "eeeeeaaaabbbbccccdddeeeee";
        String result = ""; //e10a4b4c4d3 ==> expected result

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            int count =Collections.frequency( Arrays.asList(str.split("")) , each );
            result += each+count;

        }

        System.out.println(result);

        System.out.println("---------------------------------------------------");

        Set<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList( "Ahmet", "Ahmet", "John", "James", "Breanna", "Shay", "Ahmet" ));

        System.out.println(names);

        System.out.println( names.toArray( new String[0] ) [2] );  //index numarasi olmadigi icin arary ceviridik, sonra istedigimiz elemanin index numarasini yazdik

        // another way

        System.out.println( new ArrayList<>(names).get(4) );






    }
}
