public class CreditCardFee implements FeeStrategy{
    @Override
    public double calculateFee(double amount) {
        return (2.0*amount)/100.0;
    }
}
