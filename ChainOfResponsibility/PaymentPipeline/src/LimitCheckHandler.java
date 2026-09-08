public class LimitCheckHandler implements PaymentHandler{
    private PaymentHandler nextHandler;
    @Override
    public void handle(Payment payment) {
        if(payment.getStatus()==Status.INVALID_LIMIT){
            System.out.println("Limit crossed");
            return;
        }

        if(payment.getStatus()==Status.VALID_LIMIT){
            System.out.println("Valid limit");
            payment.setStatus(Status.SUCCESS);
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
