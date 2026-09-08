//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user = new User(1, "alpha@123", "ADMIN", 26);
        UserCacheService cacheService = new UserCacheService();
        UserService service = new UserProxyService(cacheService, user);
        service.getUser(2);
        service.getUser(2);
        service.getUser(3);
        service.getUser(5);
        service.getUser(5);

    }
}