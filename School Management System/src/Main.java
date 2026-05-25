//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      School school = new School() ;
      Principal principal  = new Principal(123 ,  "Sanjeet kumar " , 30 , "Roy school " ) ;

      // public Teacher(int id, String name, int age, String subject, double salary )
      Teacher teacher1  = new Teacher(321 , "Jaivy roy " , 26 , "Programing " ,  30000.00) ;


        Teacher teacher2  = new Teacher(321 , "Jaivy  " , 28  , "Java   " ,  30000.00) ;

     ///   public Student(int id, String name, int age, String grade, double marks)
        Student  student  = new Student(520 , "ram " , 22 , "sec1 " , 85 ) ;
        school.addMember(principal ) ;
        school.addMember(teacher1);
        school.addMember(teacher2);
        school.addMember(student );

        System.out.println("===========================================");
        school.showAllMembers();
        System.out.println("============================================");
//        teacher2.getSalary() ;
//        // ✅ Fix: wrap it in println
        System.out.println("Salary: " + teacher2.getSalary());
        System.out.println("============================================");
        student.study() ;


    }
}