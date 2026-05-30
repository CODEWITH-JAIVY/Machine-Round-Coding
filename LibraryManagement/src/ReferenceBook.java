public class ReferenceBook extends  Book {

    private String topic  ;


    public ReferenceBook(String topic  ,  int bookId, String title, String author, boolean availability) {
        super(bookId, title, author, availability);
        this.topic  =  "Cannot be borrowed at all — only read inside the library" ;
    }


    public  void detail() {
        super.toString() ;
        System.out.println("Topics  " + topic  );
    }
}