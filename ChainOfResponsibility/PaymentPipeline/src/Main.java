//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Payment payment=new Payment(1,199.0,Status.NON_FRAUDULENT);
        PaymentHandler handler=new FraudCheckHandler();
        handler.handle(payment);

    }
}