public class FestivalDiscounts implements DiscountStrategy{
    @Override
    public double applyDiscount(double amount) {
        return amount-(20.0*amount)/100.0;
    }
}
