package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6));
        System.out.println(list1);

        list1 = list1.stream().distinct().collect(Collectors.toList());
        // stream hic birseyi degistirmez , onun icin burada duplicate onlemesi icin yani birseylerin degismesi icin
        // yeni list atadik

        System.out.println(list1);

        System.out.println("-----------------------------------------");

        int[] arr1 = {1,1,2,2,3,3,4,4,5,5,6,6};
        System.out.println(Arrays.toString(arr1));

        //arr1.stream()  // ==> direkt böyle cagiramiyoruz array de ama...

        arr1 = Arrays.stream(arr1).distinct().toArray();

        System.out.println(Arrays.toString(arr1));

        System.out.println("-----------------------------------------");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(10,20,33,44,55,66,77,88,99,123));
        System.out.println(list2);

        list2 = list2.stream().skip(5).collect(Collectors.toList()); // bu method da da ilk 5 elemani remove etti
        System.out.println(list2);

        System.out.println("-----------------------------------------");

        int [] nums2 = {10,20,33,44,55,66,77,88,99,123};
        System.out.println(Arrays.toString(nums2));

       nums2 = Arrays.stream(nums2).skip(4).toArray();
        System.out.println(Arrays.toString(nums2));


        System.out.println("-----------------------------------------");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(10,20,33,44,55,66,77,88,99,123));
        System.out.println(list3);

        list3 = list3.stream().limit(7).collect(Collectors.toList());
        /*
        /limit method da size in büyüklügünü belirliyor ,
           yani kac elemanli  olacak ,
                ondan sonra yazdiklarimizi silcek
         */
        System.out.println(list3);

        System.out.println("-----------------------------------------");

        List<Integer> list4 = new ArrayList<>(Arrays.asList(10,20,33,44,55,66,77,88,99,123));
        System.out.println(list4);

        list4 = list4.stream().limit(7).skip(3).collect(Collectors.toList());
        /*
         Burada da önce limit method. ardindan skip. method uyguladik
         yani önce limit i ayarlacak
         sonra o limit ten, önden kac elemani skip etmek istiyorsak onlari skip edecek
         */
        System.out.println(list4);

        System.out.println("-----------------------------------------");
        //map method()
        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list5);

        list5 = list5.stream().map( p -> p * 10 ).collect(Collectors.toList());
        System.out.println(list5);


        System.out.println("-----------------------------------------");
        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        System.out.println(days);

        days = days.stream().map( p -> p.substring(0, 3) ).collect(Collectors.toList());
        System.out.println(days);

        /*
        map method()
        burada da stirn in her elemaninin ilk 3 karakteri yazmasini istedik
        map method da lambada expression 'i kullanabiliyoruz
         */


        System.out.println("-----------------------------------------");

        List<Integer> list6 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list6);
        List<Integer> evens = list6.stream().filter( p -> p %2==0 ).collect(Collectors.toList());
        System.out.println(evens);


        System.out.println("-----------------------------------------");

        List<String> names = new ArrayList<>(Arrays.asList("Java","JAVA","jAvA","pYTHON","Ruby"));

        long countJava = names.stream().filter( p -> p.equalsIgnoreCase("java") ).count();

        System.out.println(countJava);

        /*
        count() ve filter() method beraber kullanilir genelde
        yukarida icinde ne kadar "java" yaziyor diye baktik
         */


        System.out.println("-----------------------------------------");
        // forEach() method
        // burada filter() method da ki leri yazdirdik
        names.stream().filter( p -> p.equalsIgnoreCase("java") ).forEach( p -> System.out.println(p) );


        System.out.println("-----------------------------------------");
        // allMatch() method ==> mesela hepsinin even number mi ydiye bakiyoruz

        List<Integer> list7 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        boolean r1 = list7.stream().allMatch( p -> p%2==0 );

        System.out.println(r1);

        System.out.println("-----------------------------------------");
        // anyMatch() method  ==> mesela herhangi biri even number sa true

        boolean r2 = list7.stream().anyMatch( p -> p%2==0 );
        System.out.println(r2); // true

        boolean r3 = list7.stream().anyMatch(p -> p>20);
        System.out.println(r3); // false

        List<Integer> list8 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,70,8,9,10));

        boolean r4 = list8.stream().anyMatch(p -> p>20);
        System.out.println(r4);  // true

        System.out.println("-----------------------------------------");
        //noneMatch() method  ==> mesela herhangi biri 3 'e tam bölünüyorsa false

        boolean r5 = list8.stream().noneMatch(p -> p%3==0);
        System.out.println(r5); // false


    }
}
