public class Retry extends NotificationDecorator{
    public Retry(Notification notification){
        super(notification);
    }
    @Override
    public void send(String message) {
        try {
            super.notification.send(message);
        }catch (Exception e){
            super.notification.send("retry"+message);
        }
    }

    @Override
    public String getDescription() {
        return super.notification.getDescription()+" ,retried";
    }
}
