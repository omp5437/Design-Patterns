public class WalletFee implements FeeStrategy{
    @Override
    public double calculateFee(double amount) {
        return (1.5*amount)/100.0;
    }
}
