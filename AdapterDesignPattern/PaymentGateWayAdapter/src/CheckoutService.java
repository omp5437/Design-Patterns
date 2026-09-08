public class CheckoutService {
    private PaymentProcessor paymentProcessor;
    public CheckoutService(PaymentProcessor paymentProcessor){
        this.paymentProcessor=paymentProcessor;
    }

    public void checkout(double amount){
        this.paymentProcessor.pay(amount);
    }
}
