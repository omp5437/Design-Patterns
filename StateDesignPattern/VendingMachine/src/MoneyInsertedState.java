public class MoneyInsertedState extends VendingState{
    public MoneyInsertedState(Operations operations) {
        super(operations);
    }

    @Override
    public String getDescription() {
        return "Money Inserted State";
    }

    @Override
    public void insertCoin(double amount) {
      throw new IllegalStateException("Invalid State");
    }

    @Override
    public void selectProduct() {
         try{
           System.out.println("Product selected");
           super.operations.setState(new ProductSelectedState(super.operations));
         }catch(Exception e){
             throw  e;
         }
    }

    @Override
    public void dispense() {
        throw new IllegalStateException("Invalid State");
    }

    @Override
    public void cancel() {

            System.out.println("Cancelling product selection");
            super.operations.setState(new IdleState(super.operations));

    }
    @Override
    public void reset() {
        throw new IllegalStateException("Invalid state");
    }
}
