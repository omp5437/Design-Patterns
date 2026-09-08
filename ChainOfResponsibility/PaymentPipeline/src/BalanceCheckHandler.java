public class BalanceCheckHandler implements PaymentHandler{
    private PaymentHandler nextHandler;
    @Override
    public void handle(Payment payment) {
        if(payment.getStatus()==Status.INSUFFICIENT_BALANCE){
            System.out.println("Insufficient Balance cannot move forward");
            return;
        }


        if(payment.getStatus()==Status.SUFFICIENT_BALANCE){
            System.out.println("Sufficient Balance");
            payment.setStatus(Status.VALID_LIMIT);
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
