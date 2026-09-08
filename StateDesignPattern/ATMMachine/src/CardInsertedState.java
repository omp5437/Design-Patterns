public class CardInsertedState extends ATMMachineState{
    protected CardInsertedState(ATMMachine machine) {
        super(machine);
    }

    @Override
    public String getCurrentState() {
        return "Card Inserted State";
    }

    @Override
    public void insertCard() {
     throw new IllegalStateException("Invalid State- Card Already Inserted");
    }

    @Override
    public void enterPin() {
        System.out.println("Pin Entered");
        super.machine.setState(new PinEnteredState(super.machine));
    }

    @Override
    public  void verifyPin(String Pin){
        throw new IllegalStateException("Invalid State-Pin not entered");
    }

    @Override
    public void withDraw(double amount) {
        throw new IllegalStateException("Invalid State- Card Already Inserted");
    }

    @Override
    public void checkBalance() {
        throw new IllegalStateException("Invalid State- Card Already Inserted");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected");
        super.machine.setState(new NoCardState(super.machine));
    }
}
