public class NetBankingPayment implements Payment{
    @Override
    public void pay(double amount) {
        if(amount<=0.0)
            throw new IllegalArgumentException("Amount must be greater than 0");
        System.out.println("Payment processed via Net banking");
    }
}
