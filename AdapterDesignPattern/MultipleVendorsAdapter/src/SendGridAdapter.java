public class SendGridAdapter implements NotificationSender{
    private SendGridClient sendGridClient;
    public SendGridAdapter(SendGridClient sendGridClient){
        this.sendGridClient=sendGridClient;
    }
    @Override
    public void send(String recipient, String message) {
        String email=recipient.toLowerCase().substring(11);
        sendGridClient.sendEmail(email,message.substring(0,11),message.substring(12));
    }
}
