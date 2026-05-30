public class TextBook extends  Book   {


    private  String subject  ;
    private int editionNumber ;
    private int  borrowBookfixDay   ;


    public   TextBook ( String subject  ,  int bookId, String title, String author, boolean availability) {
        super(bookId, title, author, availability);
        this.subject  =  subject  ;
        this.borrowBookfixDay  = 7  ;
    }

    public void detail() {
        super.toString() ;
        System.out.println("Subject" +  subject
                + "editionNumber " + editionNumber
                +"borrowBookfixDay " + borrowBookfixDay
        );
    }
}