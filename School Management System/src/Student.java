
public class Student extends Person {

    private String grade;
    private double marks;

    public Student(String name, int age, String grade, double marks) {
        super(name, age);          // ✅ parent constructor call
        this.grade = grade;
        this.marks = marks;
    }

    @Override
    public String getRole() {
        return "I am a Student";
    }

    public void study() {
        System.out.println("Student " + getName() + " is studying");
    }

    public String getResult() {
        return marks >= 35 ? "Pass" : "Fail";
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Grade  : " + grade);
        System.out.println("Result : " + getResult() + " (marks: " + marks + ")");
        System.out.println("─────────────────────────────");
    }
}