
public class Main {
    public static void main(String[] args) {

        School school = new School("Delhi Public School");

        school.addMember(new Student("Rahul Kumar",  16, "10th", 78.5));
        school.addMember(new Teacher("Priya Singh",  35, "Mathematics", 45000));
        school.addMember(new Principal("Mr. Sharma", 52, "Delhi Public School"));
        school.addMember(new Librarian("Sunita Devi", 40, 5000));

        school.showAllMembers();

        System.out.println();
        school.showOnlyTeachers();
    }
}