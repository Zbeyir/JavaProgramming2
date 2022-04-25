package liveReview.Week15;

public class MultiCatchExamples {

    public static void main(String[] args) {

        //
        //String word ="Java";  // ister bunu

        String word = null; // ister bunu yazdir

        try {
            System.out.println(word.substring(20)); // unchecked exception
        } catch (StringIndexOutOfBoundsException e) {   //  1111
            System.out.println(e.getClass().getSimpleName());
            System.out.println("Reason = " + e.getMessage());
        }catch (Throwable e){   // hiyerarside ki en tepe
            System.out.println(e.getClass().getSimpleName());
            System.out.println("Reason = " + e.getMessage());
       // } catch (StringIndexOutOfBoundsException e) {   // 11111---eger yukaridakine buray yazdugugumuzda
            //hata vercek yukardan silip yazsan da birsey degismeyecek

        }


    }
}
