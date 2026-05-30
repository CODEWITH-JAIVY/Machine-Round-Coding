import java.util.List;

public class TeacherMember  extends  Member  {

    private  String department  ;
    private  int maxNumber ;

    public TeacherMember(  String department  ,  int memberId, String memberName, String memberType ) {
        super(memberId, memberName, memberType ) ;
        this.department  = department  ;
        this.maxNumber  =  5 ;
    }


    // member type
    public String getmemberType ()  {
        return   super.getMemberType()  ;
    }
}