package day51_Map;

import java.util.*;

public class IteratingTheMap2 {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 90);
        students.put("Ali",85);
        students.put("Alex",80);
        students.put("Ozan",99);
        students.put("Serkan",70);
        students.put("Andriy",98);

        System.out.println("students = " + students);


        Map<String, Integer> earlyBirds = new HashMap<>();  // score >= 90
        Map<String, Integer> angryBirds = new HashMap<>();  // score < 90

        for (String key : students.keySet()) {
            Integer value = students.get(key);
            if (value >= 90){
                earlyBirds.put(key, value);
            }else {
                angryBirds.put(key, value);
            }
        }

        System.out.println("angryBirds = " + angryBirds);
        System.out.println("earlyBirds = " + earlyBirds);


        System.out.println("-------------------------------------------------------------");

        Collection<Integer> scores = students.values();

        System.out.println(scores);

        System.out.println("-------------------------------------------------------------");

        List<Integer> scores1 = new ArrayList<>( students.values() );

        System.out.println(scores1);

        System.out.println("-------------------------------------------------------------");

        for (Integer value : students.values()) {
            System.out.println(value);
        }

        System.out.println("-------------------------------------------------------------");
            //-----INTERVIEW QUESTION----------

        Integer maxScore = Integer.MIN_VALUE;
        Integer minScore = Integer.MAX_VALUE;

        for (Integer score : students.values()) {
            if (score > maxScore){
               maxScore = score;  //!!!!!--- score = maxScore;---olunca sonucu yanlis aldim---aman dikkat--!!!!
            }
            if (score < minScore){
                minScore = score;
            }
        }

        System.out.println("maxScore = " + maxScore);
        System.out.println("minScore = " + minScore);


        System.out.println("-------------------------------------------------------------");
        //-----INTERVIEW QUESTION----------ANOTHER WAY--------

        int max = Collections.max( students.values() );
        int min = Collections.min( students.values() );

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("-------------------------------------------------------------");

        // how many students has the score of 95 or greater

        int count = 0;

        for (Integer eachScore : students.values()) {
            if (eachScore >= 95){
                count ++;
            }
        }

        System.out.println(count);


        System.out.println("-------------------------------------------------------------");
            //-----Another way----
        // how many students has the score of 95 or greater

        int count1 = 0;

        for (String eachKey : students.keySet()) {
            Integer eachScore = students.get(eachKey);
            if (eachScore >= 95){
                count1 ++;
            }
        }

        System.out.println(count1);

        System.out.println("-------------------------------------------------------------");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry);
          //  System.out.println(entry.getKey());  // adece isimleri (key leri)
          //  System.out.println(entry.getValue()); // sadece score lari (value lari)
        }





    }
}
