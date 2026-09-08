public class IdleState extends VendingState{
    public IdleState(Operations operations) {
        super(operations);
    }

    @Override
    public String getDescription() {
        return "Idle State";
    }

    @Override
    public void insertCoin(double amount) {

            System.out.println("Coin inserted");
            super.operations.setState(new MoneyInsertedState(super.operations));

    }

    @Override
    public void selectProduct() {
        throw new IllegalStateException("Invalid state");
    }

    @Override
    public void dispense() {
        throw new IllegalStateException("Invalid state");
    }

    @Override
    public void cancel() {
        try {
            System.out.println("Cancelling the operation");
            super.operations.setState(new IdleState(operations));
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public void reset() {
        throw new IllegalStateException("Invalid state");
    }
}
