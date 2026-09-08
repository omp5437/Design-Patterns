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
        }
        if(nextHandler!=null){
            nextHandler.handle(payment);
        }
    }

    @Override
    public void setNextHandler(PaymentHandler nextHandler) {
       this.nextHandler=nextHandler;
    }
}
