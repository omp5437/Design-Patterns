public class User {
    private final int userId;
    private String userName;
    private String role;
    private int age;

    public User(int userId, String userName, String role, int age) {
        this.userId = userId;
        this.userName = userName;
        this.role = role;
        this.age = age;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public int hashCode(){
        return this.userId;
    }

    @Override
    public boolean equals(Object obj){
        if(obj==this)
            return true;
        if(!(obj instanceof User))
            return false;

        User user=(User)obj;
        return this.userName.equals(user.getUserName()) && this.role.equals(user.getRole()) && this.age==user.getAge();


    }
}
