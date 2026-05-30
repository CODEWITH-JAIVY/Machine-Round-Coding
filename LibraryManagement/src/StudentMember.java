import java.util.List;

public class StudentMember extends  Member  {

    private  String standard  ;
    private int borrowMaximum   ;


    public StudentMember( String standard   , int memberId, String memberName, String memberType ) {
        super(memberId, memberName, memberType );
        this.standard  = standard  ;
        this.borrowMaximum  = 2  ;
    }

    // getMember Type
    public String   getMemberType   () {
       return    super.getMemberType() ;
    }
}