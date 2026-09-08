public class UserProxyService implements UserService {
    private UserCacheService cacheService;
    private User user;
    private UserRepository repository;

    public UserProxyService(UserCacheService cacheService, User user) {
        this.cacheService = cacheService;
        this.user = user;
    }

    @Override
    public User getUser(int userId) {
        if (user.getRole().equals("ADMIN")) {
            User user = cacheService.getUser(userId);
            if (user != null){
                System.out.println("Fetched user from cache");
                return user;
            }


            if (repository == null) {
                repository = new UserRepository();
            }
            User user1 = repository.getUser(userId);
            cacheService.addToCache(user1);
          return user1;
        }
        throw new RuntimeException("Access Denied");

    }
}
