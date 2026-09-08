//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Payment payment=new Payment(1,199.0,Status.NON_FRAUDULENT);
        PaymentHandler fraudCheckHandler=new FraudCheckHandler();
        PaymentHandler limitCheckHandler=new LimitCheckHandler();
        PaymentHandler balanceCheckHandler=new BalanceCheckHandler();
        PaymentHandler paymentProcessorHandler=new PaymentProcessorHandler();
        fraudCheckHandler.setNextHandler(balanceCheckHandler);
        balanceCheckHandler.setNextHandler(limitCheckHandler);
        limitCheckHandler.setNextHandler(paymentProcessorHandler);
        fraudCheckHandler.handle(payment);

    }
}