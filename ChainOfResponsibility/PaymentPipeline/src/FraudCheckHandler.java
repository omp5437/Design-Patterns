public class FraudCheckHandler implements PaymentHandler{
    private PaymentHandler nextHandler;
    @Override
    public void handle(Payment payment) {
        if(payment.getStatus()==Status.FRAUDULENT){
            System.out.println("FRAUDULENT Alert");
            return;
        }

        if(payment.getStatus()==Status.NON_FRAUDULENT){
            System.out.println("Not a fraud attempt");
            payment.setStatus(Status.SUFFICIENT_BALANCE);
            setNextHandler(new BalanceCheckHandler());
            nextHandler.handle(payment);
            return;
        }

        System.out.println("Invalid State");
    }

    @Override
    public void setNextHandler(PaymentHandler nextHandler) {
       this.nextHandler=nextHandler;
    }
}
