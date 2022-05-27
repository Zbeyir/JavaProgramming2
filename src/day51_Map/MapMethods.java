package day51_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {

        // student name & score:
        Map<String, Integer> students = new HashMap<>();

        System.out.println(students);
        System.out.println("students.size() = " + students.size());

        students.put("Aygün", 85);
        students.put("Maria", 86);
        students.put("Ali", 95);
        students.put("Alex", 96);
        students.put("Ozan", 98);
        students.put("Serkan", 97);
        students.put("Andriy", 98);


        students.put("Ali", 85);
        students.put("Ali", 86);
        students.put("Ali", 87);

        System.out.println(students);
        System.out.println("students.size() = " + students.size());
        //size degismiyor, cünkü key de duplicate izin yok, ve en sonun cusunu kabul ediyor


        // display the score of Alex:
        System.out.println("students.get(\"Alex\") = " + students.get("Alex"));

        // replace Ali' score to 90
        students.replace("Ali", 90); // burada su cok önemli herseyi dogru tam eksikzi yazmak lazim yoksa kabul etmiiiirr
        students.replace("ALi", 900);  // mesela bunu kabul etmiiirr , cünkü; A DAN SONRAKI l KÜCÜK OLCAK
        System.out.println("students = " + students);


        //remove Alex
        students.remove("Alex");
        System.out.println("students = " + students);

        //remove Alex
        students.remove("Ozan");
        System.out.println("students = " + students);

        boolean r1 = students.containsKey("Muhtar");
        System.out.println("r1 = " + r1);
        boolean r2 = students.containsKey("Serkan");
        System.out.println("r2 = " + r2);

        boolean r3 = students.containsValue(97);
        System.out.println("r3 = " + r3);

        System.out.println("students.isEmpty() = " + students.isEmpty());

        System.out.println("-----------------------------------------------------");

        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println("map2 = " + map2);
        System.out.println("map1 = " + map1);

        System.out.println(map1 == map2); // false

        System.out.println(map1.equals(map2));  // true

        map1.clear();
        map2.clear();

        System.out.println("map2 = " + map2);
        System.out.println("map1 = " + map1);






    }
}
