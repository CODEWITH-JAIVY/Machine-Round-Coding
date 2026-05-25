
import java.util.ArrayList;
import java.util.List;

public class School {

    // ✅ List<Person> — Student, Teacher, Principal
    //    teeno aa sakte hain
    private List<Person> members = new ArrayList<>();
    private String schoolName;

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public void addMember(Person p) {
        members.add(p);
    }

    public void showAllMembers() {
        System.out.println("=== " + schoolName + " — All Members ===\n");
        for (Person p : members) {
            p.introduce();    // ✅ dynamic dispatch
        }
    }

    // Follow-up F2 — sirf Teachers count karo
    // Yahan instanceof use karna padega — iska reason:
    // List<Person> mein sab hain, type filter karna
    // compile time pe possible nahi — runtime check chahiye
    public void showOnlyTeachers() {
        System.out.println("=== Teachers Only ===");
        for (Person p : members) {
            if (p instanceof Teacher) {    // ← only valid use of instanceof
                p.introduce();
            }
        }
    }
}