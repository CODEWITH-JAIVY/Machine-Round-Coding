public class GuestMember extends   Member  {
    private String   organisation  ;
    private int maxBook ;




    public GuestMember( String organisation   ,  int memberId, String memberName, String memberType) {
        super(memberId, memberName, memberType);
        this.organisation  = organisation  ;
        this.maxBook  = 1  ;
    }

     // get the member type
    public  String getMemberType  ()  {
        return   super .getMemberType()  ;
    }
}