public class Principal extends  User {
    private  String schoolName  ;

    public Principal(int id, String name, int age, String schoolName) {
        super(id, name, age);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }


    public  void manage() {
        // "Principal [name] is managing [schoolName]"
        System.out.println("Principal  " + name  + " is " +  " managing " + schoolName );
    }

     public void callMeeting() {
        // "Meeting called by Principal [name]"
         System.out.println(" Meeting called by  Principal  " + name  );
     }

    @Override
    public void introduce() {
        // "Hi, I am [name], my ID is [id]"
        System.out.println(" Hii , i am  " + name  +  " My id is " + id );
    }
}