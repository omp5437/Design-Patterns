public class Encryption extends NotificationDecorator{
    public Encryption(Notification notification){
        super(notification);
    }

    @Override
    public void send(String message) {
       System.out.println("Message encrypted");
       super.notification.send(message);


    }

    @Override
    public String getDescription() {
        return super.notification.getDescription()+", encrypted";
    }
}
