public class NotificationService {
    private final NotificationSender notificationSender;
    public NotificationService(NotificationSender notificationSender){
        this.notificationSender=notificationSender;
    }
    public void notify(String recipient, String message){
        this.notificationSender.send(recipient,message);
    }
}
