package day50_Collections;

import java.util.*;

public class IterablePractice2 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList( "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel",
                "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"));

        System.out.println(names);

        //remove all the names "ahmed"

        /*
        burada kendim söyle bir sey yapiyorum
        names.iterator() ==>
        ==> buraya kadar yaziyor um sonra kirmizi cikiyor (parantez) ' den sonra  short hand 'i kullaniyorum
        ve gördügün gibi assagidaki ki otamatik yaziyor
         */

        Iterator<String> it = names.iterator();

        while (it.hasNext()){
            if (it.next().equalsIgnoreCase("ahmed")){  // bu condition 'i buraya koymaz isek hepsini remove edecek
                it.remove();
            }
        }

        System.out.println(names);


        System.out.println("======================================================");


        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList( "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel",
                "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"));

        System.out.println(names2);

        //remove all the names "ahmed"



        for (Iterator<String> i = names2.iterator() ; i.hasNext() ; ){
            if (i.next().equalsIgnoreCase("ahmed")){
                i.remove();
            }
        }

        System.out.println(names2);

        System.out.println("======================================================");


        List<String> names3 = new ArrayList<>();
        names3.addAll(Arrays.asList( "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel",
                "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"));

        System.out.println(names3);

        //remove all the names "ahmed"

        names3.removeIf(each -> each.equalsIgnoreCase("ahmed"));

        System.out.println(names3);

        System.out.println("======================================================");

        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,100,90,89,79,50));

        Iterator<Integer> q = set.iterator();

        while (q.hasNext()){
            if (q.next() %2 ==0){
                q.remove();
            }
        }
        System.out.println(set);

    }
}
