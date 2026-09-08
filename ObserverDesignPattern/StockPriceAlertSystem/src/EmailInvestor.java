public class EmailInvestor  implements  Investor{
    @Override
    public void update(Stock stock) {
        System.out.println("Email - Changes in stock prices: "+stock.toString());
    }
}
