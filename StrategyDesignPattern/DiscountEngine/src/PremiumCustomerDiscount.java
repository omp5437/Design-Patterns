public class PremiumCustomerDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double amount) {
        return amount-(15.0*amount)/100.0;
    }
}
