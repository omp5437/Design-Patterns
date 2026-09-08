public class ProcessPaymentCommand implements Command{
    private String paymentInfo;
    public ProcessPaymentCommand(String paymentInfo){
        this.paymentInfo=paymentInfo;
    }
    @Override
    public void execute() {
        if(paymentInfo!=null)
        System.out.println("Payment processed "+paymentInfo);
    }



}
