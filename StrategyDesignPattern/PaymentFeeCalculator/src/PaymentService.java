public class PaymentService {
    private FeeStrategy feeStrategy;
    public PaymentService(FeeStrategy feeStrategy){
        this.feeStrategy=feeStrategy;
    }

    public double calculateFee(double amount){
       return this.feeStrategy.calculateFee(amount);
    }

    public void setFeeStrategy(FeeStrategy inputStrategy){
          this.feeStrategy=inputStrategy;
    }
}
