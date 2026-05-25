import java.util.ArrayList;
import java.util.List;

public class School {
    List<User> userList  = new ArrayList<>();


      public void showAllMembers() {
          for(User user : userList ) {
              System.out.println(user);
          }
      }

      public void addMember(User p) {
          userList.add(p) ;
      }


}