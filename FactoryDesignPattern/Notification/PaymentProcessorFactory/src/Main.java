import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc=new Scanner(System.in);
        while(true){
            String s=sc.next();
            Double amount=sc.nextDouble();
            try {
            Payment payment=PaymentProcessorFactory.createPayment(PaymentType.valueOf(s));

            payment.pay(amount);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}