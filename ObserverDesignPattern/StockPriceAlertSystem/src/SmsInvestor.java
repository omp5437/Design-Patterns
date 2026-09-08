public class SmsInvestor implements Investor{
    @Override
    public void update(Stock stock) {

        System.out.println("SMS - Changes in stock prices: "+stock.toString());
    }
}
