//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       EventManager eventManager=new EventManager();
       Stock bnpParibas=new Stock("BNP Paribas",100.0,eventManager);
       Stock zomato=new Stock("Zomato",270.88,eventManager);
       Stock swiggy=new Stock("Swiggy",130.66,eventManager);
       Stock metalIndia=new Stock("Metal India",2265.87,eventManager);
       Stock reliance=new Stock("Reliance",3455.61,eventManager);
       Investor emailInvestor=new EmailInvestor();
       Investor smsInvestor=new SmsInvestor();

       eventManager.subscribe(bnpParibas,emailInvestor);
       eventManager.subscribe(bnpParibas,smsInvestor);
       eventManager.subscribe(zomato,emailInvestor);
       eventManager.subscribe(zomato,smsInvestor);
       eventManager.subscribe(swiggy,emailInvestor);
       eventManager.subscribe(reliance,smsInvestor);


       bnpParibas.setStockPrice(110.25);
       swiggy.setStockPrice(165.32);
       metalIndia.setStockPrice(3567.89);
       eventManager.unSubscribe(zomato,smsInvestor);
       reliance.setStockPrice(3654.72);
       zomato.setStockPrice(265.08);

    }
}