public class Student extends  User  {

    private  String grade   ;
    private double marks  ;

    public Student(int id, String name, int age, String grade, double marks) {
        super(id, name, age);
        this.grade = grade;
        this.marks = marks;
    }

    @Override
    public void introduce() {
      //  System.out.println("Hi, I am " + name +  " my ID is " +  id );
    }

    void study()  {
        System.out.println("Student " + name +  " is studying");
    }

    // getResult() → agar marks >= 35 toh "Pass" warna "Fail"

    private void  getResult() {
        if(marks>= 35 ) {
            System.out.println("Student " + name  + "is pass  ");
        }else {
            System.out.println("Student " + name  + "is fail    ");
        }
    }

}