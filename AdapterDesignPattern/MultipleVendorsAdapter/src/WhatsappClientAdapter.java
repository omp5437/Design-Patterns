public class WhatsappClientAdapter implements NotificationSender{
    private WhatsappClient whatsappClient;
    public WhatsappClientAdapter(WhatsappClient whatsappClient){
        this.whatsappClient=whatsappClient;
    }
    @Override
    public void send(String recipient, String message) {
        String phoneNumber=recipient.substring(0,10);
        String messageBody=message.substring(11);
        whatsappClient.sendMessage(phoneNumber,messageBody);
    }
}
