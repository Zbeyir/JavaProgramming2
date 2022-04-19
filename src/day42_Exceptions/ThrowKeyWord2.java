package day42_Exceptions;

import day39_Recap.shapeTask.Rectangle;

import java.util.NoSuchElementException;

public class ThrowKeyWord2 {

    public static void main(String[] args) {

        throw new NoSuchElementException("No such Element");

        //throw new InterruptedException();

        //System.out.println("Hello World");

        //throw Rectangle(5,7);





    }
}

/*
1-) Exception dan sonra mesaj yazamayiz (cikti alamayiz)
2-) Sadece unchecked exception lar ile system den cikabiliriz
yukarida gördügün gibi, digerleri ile cikamiyoruz hata veriyor
 */
