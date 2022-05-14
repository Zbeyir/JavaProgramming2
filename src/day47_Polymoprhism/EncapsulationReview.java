package day47_Polymoprhism;

public class EncapsulationReview {

    private String bookTitle;
    private final String publishDate;


    public EncapsulationReview(String bookTitle, String publishDate) {
       // this.bookTitle = bookTitle;
        setBookTitle(bookTitle);
        this.publishDate = publishDate; // bunun setter i olmadigi icin variable control etmek istersek burada , bundan önce yazacagiz
    }

    public String getBookTitle() {
        if (bookTitle == null){
            return "";
        }
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        if (bookTitle == null || bookTitle.isEmpty()){
            throw  new RuntimeException("Invalid data");
        }
        this.bookTitle = bookTitle;
    }

    public String getPublishDate() {   // gördügün gibi bunun set i yok final oldugu icin
        return publishDate;
    }

   /*
    private String getPublishDate() {
        return publishDate;
    }
    access modifier i private olunca hata vermez ama baska sinifta göremeyiz , read yapayiz baska sinifta

    */

// null ==> data yok
    // empty ==> ama bunda bosluk var(olabilir)


}
