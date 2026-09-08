
import java.util.HashMap;


public class UserCacheService implements UserService{
    private HashMap<Integer,User> users;
    public UserCacheService(){
        users=new HashMap<>();
    }
    @Override
    public User getUser(int userId) {
       User user=users.get(userId);
       return user;
    }

    public void addToCache(User user){
        users.put(user.getUserId(), user);
    }
}
