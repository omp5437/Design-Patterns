public class RegularCustomerDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double amount) {
        return amount-(5.0*amount)/100.0;
    }
}
