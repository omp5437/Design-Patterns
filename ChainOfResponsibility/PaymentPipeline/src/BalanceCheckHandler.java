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
            setNextHandler(new LimitCheckHandler());
            payment.setStatus(Status.VALID_LIMIT);
            nextHandler.handle(payment);
            return;
        }

      System.out.println("Invalid Status");

    }

    @Override
    public void setNextHandler(PaymentHandler nextHandler) {
      this.nextHandler=nextHandler;
    }
}
