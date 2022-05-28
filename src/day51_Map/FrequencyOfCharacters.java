package day51_Map;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "bbcccaaaaa";

        //bca
        //235
        //Collections.frequency()

        String[] arr = str.split("");

      //  Map<String, Integer> result = new HashMap<>(); // ==> eger bu Map 'i secse idik sonuc böyle karisik ti ==> {a=5, b=2, c=3}

        Map<String, Integer> result = new LinkedHashMap<>(); // order yapan tek Map bu oldugu icin bunu sectik


        for (String each : arr) {
            result.put(each, Collections.frequency(Arrays.asList(arr), each));
        }

        System.out.println(result);


    }
}

/*
        ######-----INTERVIEW QUESTION------#######

                2. Write a program that can return the frequency of characters
                        Not: MUST use map
                        Ex: str = "bbcccaaaaa"
                        output:
                            {b=2, c=3, a=5}
              */