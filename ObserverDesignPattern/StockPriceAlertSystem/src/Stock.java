public class Stock {
    private final String stockName;
    private final EventManager eventManager;
    private double stockPrice;
    public Stock(String stockName, double stockPrice,EventManager eventManager){
        this.stockName=stockName;
        this.stockPrice=stockPrice;
        this.eventManager=eventManager;

    }

    public String getStockName() {
        return stockName;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
        eventManager.notifyEvents(this);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockName='" + stockName + '\'' +
                ", stockPrice=" + stockPrice +
                '}';
    }
}
