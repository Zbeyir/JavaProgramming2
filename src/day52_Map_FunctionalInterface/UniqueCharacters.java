package day52_Map_FunctionalInterface;

import java.util.*;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabcccdeeeef";

        String[] arr = str.split("");

        Map<String, Integer> result = new LinkedHashMap<>();


        for (String each : arr) {
            int frequency = Collections.frequency( Arrays.asList(arr), each);
            if (frequency==1)
            result.put(each, frequency);
        }

        System.out.println(result);

/*
#####----Burada LinkedHashMap<>(); 'i kullandik.
         Cünkü;
            bu map oldugu gibi cikti almamizi sagliyor.
            Ama; eger;
             new TreeMap<>() 'i kullansa idik
             bu sefer bize siraliyacak ti.....
 */



    }
}

/*
Warmup tasks:
	1. Write a program that can find the unique characters from a String

			Ex:
					str = "aabcccdeeeef";

			output:
					{b=1, d=1, f=1}
 */
