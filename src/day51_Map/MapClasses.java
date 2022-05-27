package day51_Map;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        //    key     value
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "Arthur");
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Isabella");
        hashMap.put(5, "Ahmed");
        hashMap.put(6, "Ahmed");
        hashMap.put(7, "Ahmed");
        hashMap.put(8, "Ahmed");
        hashMap.put(null, "Cihad");
        hashMap.put(null, "Emre");
        hashMap.put(null, "Hülya");
        hashMap.put(12, null);
        hashMap.put(13, null);


        System.out.println("hashMap = " + hashMap);
        // key de duplicate izin yok ama value de var, böyle yazarsak sonuncu yazdigimiz 'i kabul edecek
        // des advantage is the order is not garanti
        //null yazin ca da ==> bu durum da da son yazdigimiz null u kabul edcek hulya yi

        System.out.println("hashMap.get(8) = " + hashMap.get(8));



        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Isabella");
        linkedHashMap.put(5,"Ahmed");
        linkedHashMap.put(null,"Hulya");

        System.out.println("linkedHashMap = " + linkedHashMap);
        // burada order var , yani girdigimiz sira ile cikti alabiliyoruz
        // ama duplicate yine yok , ayni key de girdigimiz value ler den sadece sonun cu olani kabul ediyor



        Map<Integer, String> treeMap = new TreeMap<>(); // Key can not be null, value can be null and duplicated
        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Isabella");
        treeMap.put(5,"Ahmed");
        treeMap.put(7, null);
        // treeMap.put(null,"Hulya"); //==> NullPointerException

        System.out.println("treeMap = " + treeMap);



        Map<Integer, String> hashtable = new Hashtable<>();  //  key and value both can not null
        hashtable.put(10, "Arthur");
        hashtable.put(20, "George");
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Isabella");
        hashtable.put(5,"Ahmed");
      //  hashtable.put(6, null);  // ==>NullPointerException
      //  hashtable.put(null, "Hulya"); //==> NullPointerException

        System.out.println("hashtable = " + hashtable);


        // sadece bu 4 'ü nü kullanabiliyoruz (tanimlayabiliyoruz)
        //int ve string (key, value) elemanlari kabul edecek yani double ve boolean kabul etmiyecek
        //cünkü (key, value) ne tanimlanirsa onu kabul edcek put() method da eleman eklerken
        // EGER DOUBLE VE BOOLEAN KABUL ETMESINI ISTIYORSAK ASSAGIDAKI GIBI TANIMLANMALI
        Map<Double, Boolean> hashMap1 = new HashMap<>();
         // ||==>YANI BURAYA NE YAZARSAK ONU KABUL EDECEK


        String str = null;

       // System.out.println(str.toUpperCase());  //==> NullPointerException

    }
}
