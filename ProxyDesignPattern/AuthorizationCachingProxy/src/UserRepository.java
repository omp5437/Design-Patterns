import java.util.ArrayList;
import java.util.List;

public class UserRepository implements UserService{
    private List<User> userList;
    public UserRepository(){
        userList=new ArrayList<>();
        userList.add(new User(2,"arun@345","USER",42));
        userList.add(new User(3,"mike@789","USER",34));
        userList.add(new User(4,"jitu@345","USER",32));
        userList.add(new User(5,"mohit@789","USER",29));
        userList.add(new User(6,"harshit@234","USER",29));

    }

    @Override
    public User getUser(int userId) {
        for(User user: userList){
            if(user.getUserId()==userId){
                System.out.println("Fetched user from DB");
                return user;
            }
        }
        throw new RuntimeException("User not found");
    }

}
