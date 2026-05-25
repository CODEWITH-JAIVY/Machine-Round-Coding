public class Teacher extends  User {


    private String subject  ;
    private    double salary  ;

    public Teacher(int id, String name, int age, String subject, double salary ) {
        super(id, name, age);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    private  void teach() {
         // "Teacher [name] is teaching [subject]"
        System.out.println( " Teacher  " + name + " is teaching " + subject  );
    }

    @Override
    public void introduce() {
        System.out.println( "Hi, I am "  + name + " my  id "  + "is"  + id   );
    }
}