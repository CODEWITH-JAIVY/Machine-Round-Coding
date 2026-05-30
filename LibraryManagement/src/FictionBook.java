public class FictionBook extends  Book  {

    private  String category  ;
    private  int  borroweDay  ;

    public FictionBook( String category  ,   int bookId, String title, String author, boolean  availability) {
        super(bookId, title, author, availability);

        this.category   = category  ;
        this.borroweDay   =  14  ;
    }


    private  void details () {
        super.toString() ;
        System.out.println("category='" + category + '\'' +
                ", borroweDay=" + borroweDay );
    }


}