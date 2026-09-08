public class TwilioClient {
    public void sendSms(String phoneNumber,String text){
        System.out.println("Message sent via twilio client to phonenumber: XXXXX"+ phoneNumber.substring(5));
    }
}
