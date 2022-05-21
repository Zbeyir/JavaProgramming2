package day49_Collections;

import java.util.*;

public class SetInterfacePractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 300, 200, 90));
        list.addAll(Arrays.asList(10, 20, 300, 200, 90));
        list.addAll(Arrays.asList(10, 20, 300, 200, 90));
        list.addAll(Arrays.asList(10, 20, 300, 200, 90));
        list.addAll(Arrays.asList(10, 20, 300, 200, 90));
        list.addAll(Arrays.asList(null, null, null));

        System.out.println("list = " + list);
        System.out.println(list.get(4));


        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(10, 20, 300, 200, 90));
        hashSet.addAll(Arrays.asList(10, 20, 300, 200, 90));
        hashSet.addAll(Arrays.asList(10, 20, 300, 200, 90));
        hashSet.addAll(Arrays.asList(10, 20, 300, 200, 90));
        hashSet.addAll(Arrays.asList(10, 20, 300, 200, 90));
        hashSet.addAll(Arrays.asList(null, null, null));

        System.out.println("hashSet = " + hashSet);
        // remove duplicate does not possible ==> gördügün gibi yazdirinca duplicate e izin vermiyor
        // System.out.println(hashSet.get(4));  //  ==> burada bunu kullanamiyoruz

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(10, 20, 300, 200, 90));
        linkedHashSet.addAll(Arrays.asList(10, 20, 300, 200, 90));
        linkedHashSet.addAll(Arrays.asList(10, 20, 300, 200, 90));
        linkedHashSet.addAll(Arrays.asList(10, 20, 300, 200, 90));
        linkedHashSet.addAll(Arrays.asList(10, 20, 300, 200, 90));
        linkedHashSet.addAll(Arrays.asList(null, null, null));

        System.out.println("linkedHashSet = " + linkedHashSet);


        Set<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(10, 20, 300, 200, 90));
        treeSet.addAll(Arrays.asList(10, 20, 300, 200, 90));
        treeSet.addAll(Arrays.asList(10, 20, 300, 200, 90));
        treeSet.addAll(Arrays.asList(10, 20, 300, 200, 90));
        treeSet.addAll(Arrays.asList(10, 20, 300, 200, 90));
        //treeSet.addAll(Arrays.asList(null,null,null));

        System.out.println("treeSet = " + treeSet);

        String str = null;
       // System.out.println(str.charAt(0));
        /*
        bunun verdigi exception ile yukarida ki TreeSet in (null) yazinca verdigi exception ini sonucu ayni
        yani;;;  null keyWord does not to accept
         */


    }
}
