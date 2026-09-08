//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

          PaymentService paymentService=new PaymentService(new CreditCardFee());
          double creditCardFee= paymentService.calculateFee(2556.38);
          paymentService.setFeeStrategy(new UPIFee());
          double upiFee= paymentService.calculateFee(5622.00);
          paymentService.setFeeStrategy(new WalletFee());
          double walletFee= paymentService.calculateFee(1455.00);
          System.out.println("Credit card fee: "+creditCardFee);
          System.out.println("UPI fee: "+upiFee);
          System.out.println("Wallet fee: "+walletFee);


    }
}