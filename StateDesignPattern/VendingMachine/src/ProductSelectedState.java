public class ProductSelectedState extends VendingState{
    public ProductSelectedState(Operations operations) {
        super(operations);
    }

    @Override
    public String getDescription() {
        return "Product Selected State";
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

            System.out.println("Dispensing the item");
            super.operations.setState(new DispenseState(super.operations));
    }

    @Override
    public void cancel() {
       throw  new IllegalStateException("Invalid State-Order cannot be cancelled now");
    }
    @Override
    public void reset() {
        throw new IllegalStateException("Invalid state");
    }
}
