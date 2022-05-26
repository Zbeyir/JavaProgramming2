package day50_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        // remove all the elements that are less than 4

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 4){
                list.remove(i);
            }
        }
        System.out.println(list);

        System.out.println("=============================================================");

        List<Integer> lis2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        // remove all the elements that are less than 4

        Iterator<Integer> it = lis2.iterator();

        /*
        boolean r1 = it.hasNext();
        System.out.println(r1); // true ==> //--->false eger icinde eleman tanimlamaz isek

        System.out.println(it.next());

        boolean r2 = it.hasNext();
        System.out.println(r2); // eger bunu sonucu false ise ===> it.next() method u kullanamayiz

        System.out.println(it.next());

         */

        while (it.hasNext()){
            if (it.next() < 4){
                it.remove();
            }
        }

        System.out.println(lis2);

        System.out.println("=============================================================");
        //buda for loop ile cözümü

        List<Integer> lis3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        // remove all the elements that are less than 4

        for (Iterator<Integer> i=lis3.iterator() ; i.hasNext() ;){
            if (i.next() < 4){
                i.remove();
            }
        }

        System.out.println(lis3);


        System.out.println("=============================================================");

        List<Integer> lis4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
            // Another way with lambada expiration

        // remove all the elements that are less than 4

        lis4.removeIf( each -> each < 4 );  // removeIf 'in üstüne bas bak java da while loop ile cözmüs

        System.out.println(lis4);







    }
}
