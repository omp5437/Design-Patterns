public class EmailNotification implements Notification{
    @Override
    public void send(String message) {
      System.out.println("Email- "+message);
    }

    @Override
    public String getDescription() {
        return "Message was sent via Email";
    }
}
