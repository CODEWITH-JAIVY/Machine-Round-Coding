
public class Principal extends Person {

    private String schoolName;

    public Principal(String name, int age, String schoolName) {
        super(name, age);         // ✅ parent constructor call
        this.schoolName = schoolName;
    }

    @Override
    public String getRole() {
        return "I am a Principal";
    }

    public void manage() {
        System.out.println("Principal " + getName() +
                " is managing " + schoolName);
    }

    public void callMeeting() {
        System.out.println("Meeting called by Principal " + getName());
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("School : " + schoolName);
        System.out.println("─────────────────────────────");
    }
}