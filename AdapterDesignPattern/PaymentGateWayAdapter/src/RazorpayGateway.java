public class RazorpayGateway {


    public void makePayment(double amount, String currency){
        System.out.println("Payment through Razorpay: "+String.format("%.2f",amount)+ " "+currency);
    }
}
