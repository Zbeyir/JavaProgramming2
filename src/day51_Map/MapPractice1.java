package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        //  1. Update the "M" to Male and "F" to Female

        for (String key : employeeMap.keySet()) {
            if (employeeMap.get(key).equalsIgnoreCase("m")){
                employeeMap.replace(key, "Male");
            }
            if(employeeMap.get(key).equalsIgnoreCase("f")){
                employeeMap.replace(key, "Female");
            }
        }

        System.out.println(employeeMap);

        System.out.println("--------------------------------------------------------");
        //--------------------Another way----------------
        //  1. Update the "M" to Male and "F" to Female

        Map<String, String> employeeMap1 = new HashMap<>();
        employeeMap1.put("Ddene", "F");
        employeeMap1.put("Winfred", "M");
        employeeMap1.put("Jereme", "M");
        employeeMap1.put("Glad", "F");
        employeeMap1.put("Desirae", "F");
        employeeMap1.put("Kakalina", "F");
        employeeMap1.put("Bertrando", "M");
        employeeMap1.put("Ajay", "F");
        employeeMap1.put("Brigitte", "F");
        employeeMap1.put("Derk", "M");
        employeeMap1.put("Orlando", "M");
        employeeMap1.put("Selle", "F");
        employeeMap1.put("Marika", "F");

        for (Map.Entry<String, String> entry : employeeMap1.entrySet()) {
            if (entry.getValue().equalsIgnoreCase("m")){
                entry.setValue("Male");
               // employeeMap1.replace(entry.getKey(), "Male"); // bu yolda var emme ben sevmedim
            }else {
                entry.setValue("Female");  // burada kodu tekrar yazmadim yukaruda da bunu yapabilirdim
            }
            System.out.println(entry);
        }
        //System.out.println(employeeMap1); // bu sefer bu sekil degil de yukarida entry yaparak yazdirdim loop un icin de


        System.out.println("--------------------------------------------------------");

        //  2. Display the names of all female employees

        for (Map.Entry<String, String> eachPair : employeeMap.entrySet()) {
            String eachKey = eachPair.getKey();
            String eachValue = eachPair.getValue();

            if (eachValue.equals("Female")){
                System.out.println(eachKey);
            }
        }


    }
}
