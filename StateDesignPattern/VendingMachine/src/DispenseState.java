public class DispenseState extends VendingState{
    public DispenseState(Operations operations) {
        super(operations);
    }

    @Override
    public String getDescription() {
        return "Dispensed State";
    }

    @Override
    public void insertCoin(double amount) {
      throw new IllegalStateException("Invalid State");
    }

    @Override
    public void selectProduct() {
        throw new IllegalStateException("Invalid State");
    }

    @Override
    public void dispense() {
        throw new IllegalStateException("Invalid State");
    }

    @Override
    public void cancel() {
        throw new IllegalStateException("Invalid State");
    }

    public void reset(){
        super.operations.setState(new IdleState(operations));
    }
}
