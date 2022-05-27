package day51_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IteratingTheMap {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();
        students.put("Aygün", 85);
        students.put("Maria", 86);
        students.put("Ali", 95);
        students.put("Alex", 96);
        students.put("Ozan", 98);
        students.put("Serkan", 97);
        students.put("Andriy", 98);


        Set<String> keys = students.keySet();

        for (String eachKey : keys) {
            System.out.println(eachKey + " : " + students.get(eachKey));
        }


        System.out.println("========================================");


        for (String eachKey : keys) {
            students.replace(eachKey, students.get(eachKey) + 5);
            System.out.println(eachKey + " : " + students.get(eachKey));
        }


        System.out.println("========================================");


        System.out.println("students = " + students);


    }
}
