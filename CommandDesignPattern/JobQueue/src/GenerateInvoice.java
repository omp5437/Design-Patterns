public class GenerateInvoice implements Command{
    private String paymentInfo;

    public GenerateInvoice(String paymentInfo){
        this.paymentInfo=paymentInfo;
    }
    @Override
    public void execute() {
        if(paymentInfo==null){
            throw new RuntimeException("Payment info required for genrating invoice");
        }
        System.out.println("Invoice generated "+paymentInfo);
    }


}
