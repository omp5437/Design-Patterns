//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Notification notification=new Encryption(new Retry(new Logging(new EmailNotification())));
        notification.send("New notification");
        System.out.println(notification.getDescription());
    }
}