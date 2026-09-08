public class TwilioClientAdapter implements NotificationSender{
    private final TwilioClient twilioClient;
    public TwilioClientAdapter(TwilioClient twilioClient){
        this.twilioClient=twilioClient;
    }
    @Override
    public void send(String recipient, String message) {
        String phoneNumber=recipient.substring(0,10);
        String messageBody=message.substring(11);
        twilioClient.sendSms(phoneNumber,messageBody);
    }
}
