//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TwilioClient twilioClient = new TwilioClient();
        WhatsappClient whatsappClient = new WhatsappClient();
        SendGridClient sendGridClient = new SendGridClient();


        NotificationSender whatsapp = new WhatsappClientAdapter(whatsappClient);
        NotificationSender sendGrid = new SendGridAdapter(sendGridClient);
        NotificationSender twilio = new TwilioClientAdapter(twilioClient);
        NotificationService service1 = new NotificationService(whatsapp);
        NotificationService service2 = new NotificationService(sendGrid);
        NotificationService service3 = new NotificationService(twilio);
        String recipient = new String("0123456789 abc@gmail.com");
        String message = new String("subject1234 This is a new message");

        service1.notify(recipient, message);
        service2.notify(recipient, message);
        service3.notify(recipient, message);


    }
}