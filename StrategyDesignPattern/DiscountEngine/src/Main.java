//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      DiscountContext context=new DiscountContext();
      context.addDiscountStartegy(new FestivalDiscounts());
      context.addDiscountStartegy(new PremiumCustomerDiscount());
      double totalAmount=context.applyDiscount(2499.00);
      double totalDiscount=2499.00-totalAmount;
      System.out.println(String.format("Total discount availed: %.2f",totalDiscount));
      System.out.println(String.format("Total amount after Discount: %.2f",totalAmount));

    }
}