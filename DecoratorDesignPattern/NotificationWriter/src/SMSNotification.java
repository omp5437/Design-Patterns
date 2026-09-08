public class SMSNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("SMS- "+message);
    }

    @Override
    public String getDescription() {
        return "Message was sent via SMS";
    }
}
