public class PaymentProcessorFactory {

    public static Payment createPayment(PaymentType type){
        switch (type) {
            case NET_BANKING:
                return new NetBankingPayment();
            case UPI:
                return new UPIPayment();
            case CREDIT_CARD:
                return new CreditCardPayment();
            default:
                throw new IllegalArgumentException("Unsupported type: "+type);

        }

    }
}
