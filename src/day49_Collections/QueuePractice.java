package day49_Collections;

import java.util.*;

public class QueuePractice {

    public static void main(String[] args) {


        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10,200,300,40,90));

        //because orders is Queue random

        System.out.println("priorityQueue = " + priorityQueue);

        System.out.println("-----------------------------------------");

        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("arrayDeque = " + arrayDeque);

        System.out.println("-----------------------------------------");

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("linkedList = " + linkedList);


        System.out.println("---------------------after poll() method---FIFO------------------");

        priorityQueue.poll();

        System.out.println("priorityQueue = " + priorityQueue);

        priorityQueue.poll();

        System.out.println("priorityQueue = " + priorityQueue);

        arrayDeque.poll();
        System.out.println("arrayDeque = " + arrayDeque);

        linkedList.poll();
        System.out.println("linkedList = " + linkedList);


        System.out.println("-----------------------------------------");

       //  System.out.println( priorityQueue.get(1) ); //==> it does not have index number
       //  System.out.println(arrayDeque.get(1));  //==> it does not have index number

       // System.out.println(linkedList.get(1));  // down casting==> bu durumda iken sag tusa bas

        System.out.println(((LinkedList<Integer>) linkedList).get(1));  //down casting==> burada ben kirmizinin üstüne gelip sag tusa bas

       // System.out.println( ( (LinkedList)linkedList).get(1));  //down casting==> buda muhtar in yolu



    }
}
