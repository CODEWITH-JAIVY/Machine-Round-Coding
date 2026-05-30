import java.util.List;

public class Member {

    private  int memberId ;
    private String memberName  ;
    private  String memberType  ;
    private List<Book>borrowbook  ;


    public Member(int memberId, String memberName, String memberType ) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberType = memberType;
//        this.borrowbook = borrowbook;
    }

    public Member() {

    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public List<Book> getBorrowbook() {
        return borrowbook;
    }

    public void setBorrowbook(List<Book> borrowbook) {
        this.borrowbook = borrowbook;
    }
}