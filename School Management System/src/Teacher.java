
public class Teacher extends Person {

    private String subject;
    private double salary;

    public Teacher(String name, int age, String subject, double salary) {
        super(name, age);         // ✅ parent constructor call
        this.subject = subject;
        this.salary  = salary;
    }

    @Override
    public String getRole() {
        return "I am a Teacher";
    }

    public void teach() {
        System.out.println("Teacher " + getName() + " is teaching " + subject);
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Subject : " + subject);
        System.out.println("Salary  : ₹" + salary);
        System.out.println("─────────────────────────────");
    }
}