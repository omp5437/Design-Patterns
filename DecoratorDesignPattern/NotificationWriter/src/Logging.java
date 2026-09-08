public class Logging extends NotificationDecorator{
    public Logging(Notification notification){
        super(notification);
    }

    @Override
    public void send(String message) {
        System.out.println("Logging...");
        super.notification.send(message);
        System.out.println("logging finished");

    }

    @Override
    public String getDescription() {
        return super.notification.getDescription()+", logged";
    }
}
