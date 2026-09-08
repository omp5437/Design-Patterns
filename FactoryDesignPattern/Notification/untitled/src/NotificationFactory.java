public class NotificationFactory {
    public Notification create(NotificationType type){
        if(type.equals(NotificationType.EMAIL)){
            return new EmailNotification();
        }else if(type.equals(NotificationType.SMS)){
            return new SMSNotification();
        }else if(type.equals(NotificationType.PUSH)){
            return new PushNotification();
        }else{
            return null;
        }
    }
}
