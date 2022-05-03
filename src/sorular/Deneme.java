package sorular;

import java.util.Arrays;
import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

        String[] newWord = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            newWord[i] = words[i].substring(0, 1) + words[i].substring(words[i].length() - 1);
        }


        //System.out.println(Arrays.toString(newWord));

        for (String s : newWord) {
            System.out.println(s);
        }

    }
}

/*
edwar göndernisti
public static void main(String[] args)
{          Scanner input = new Scanner(System.in);
      String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
              // leave above code alone 🙂         // assume you have String array of 5 items
                     //and print first and last char of each items in one line
                            //TODO: Write your code below
                                String [] newWord=new String[words.length];
                                      for (int i = 0; i < words.length; i++) {
                                            newWord[i] =words[i].substring(0,1) + words[i].substring(words[i].length()-1);
                                                   }         System.out.println(Arrays.toString(newWord));
                                                   hocam kusura bakma rahatsız ediyorum , sonuç çıktısını alt alta, yani her çıktı ayrı bir line da olmasını istiyorum nasıl yapabilirim
 */