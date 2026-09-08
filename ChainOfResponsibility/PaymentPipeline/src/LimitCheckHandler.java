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
            setNextHandler(new PaymentProcessorHandler());
            payment.setStatus(Status.SUCCESS);
            nextHandler.handle(payment);
            return;
        }

        System.out.println("Inavlid status");

    }

    @Override
    public void setNextHandler(PaymentHandler nextHandler) {
       this.nextHandler=nextHandler;
    }
}
