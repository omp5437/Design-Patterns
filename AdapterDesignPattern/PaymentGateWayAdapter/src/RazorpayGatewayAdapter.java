public class RazorpayGatewayAdapter implements PaymentProcessor{
    private RazorpayGateway razorpayGateway;
    public RazorpayGatewayAdapter(RazorpayGateway razorpayGateway){
        this.razorpayGateway=razorpayGateway;
    }

    @Override
    public void pay(double amount) {
        amount=(amount*1.0)/95.50;
        razorpayGateway.makePayment(amount,"dollar");
    }
}
