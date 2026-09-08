public interface State {
    String getDescription();
    void insertCoin(double amount);
    void selectProduct();
    void dispense();
    void cancel();
    void reset();

}
