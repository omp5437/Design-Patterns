public class Metrics extends NotificationDecorator{
    public Metrics(Notification notification){
        super(notification);
    }
    @Override
    public void send(String message) {
        long start=System.currentTimeMillis();
        super.notification.send(message);
        long end=System.currentTimeMillis();
        System.out.println(end-start+" ms");

    }

    @Override
    public String getDescription() {
        return super.notification.getDescription()+", metrics";
    }
}
