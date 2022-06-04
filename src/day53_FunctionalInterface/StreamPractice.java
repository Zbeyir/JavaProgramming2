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








    }
}
