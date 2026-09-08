public class PaymentProcessorHandler implements PaymentHandler{
    private PaymentHandler nextHandler;
    @Override
    public void handle(Payment payment) {
        if(payment.getStatus()==Status.FAIL){
            System.out.println("Payment failed");
            this.updateAuditLog(payment);
            return;
        }

        if(payment.getStatus()==Status.SUCCESS){
            System.out.println("Payment success");
            updateAuditLog(payment);
        }

    }

    @Override
    public void setNextHandler(PaymentHandler nextHandler) {
        nextHandler=null;
    }

    public void updateAuditLog(Payment payment){
        System.out.println("Audit updated with status: "+payment.getStatus());
    }
}
