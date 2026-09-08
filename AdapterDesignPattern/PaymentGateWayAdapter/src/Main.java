
public class Main {
    public static void main(String[] args) {
       PaymentProcessor paymentProcessor=new RazorpayGatewayAdapter(new RazorpayGateway());
       CheckoutService service=new CheckoutService(paymentProcessor);
       service.checkout(76.34);
       service.checkout(549);

    }
}