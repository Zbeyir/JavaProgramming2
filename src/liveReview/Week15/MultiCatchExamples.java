package liveReview.Week15;

public class MultiCatchExamples {

    public static void main(String[] args) {

        //
        String word ="Java";

        try {
            System.out.println(word.substring(20)); // unchecked exception
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println("Reason = " + e.getMessage());
        }catch (Throwable e){   // hiyerarside ki en tepe
            System.out.println(e.getClass().getSimpleName());
            System.out.println("Reason = " + e.getMessage());

        }


    }
}
