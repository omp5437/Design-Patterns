public class NoCardState extends ATMMachineState{
    public NoCardState(ATMMachine machine) {
        super(machine);
    }

    @Override
    public String getCurrentState() {
        return "NO CARD STATE";
    }

    @Override
    public void insertCard() {
     System.out.println("Card inserted");
     super.machine.setState(new CardInsertedState(super.machine));
    }

    @Override
    public void enterPin() {
        throw new IllegalStateException("Invalid State-Card not inserted");
    }

    @Override
    public void verifyPin(String verify) {
        throw new IllegalStateException("Invalid State-Card not inserted");
    }

    @Override
    public void withDraw(double amount) {
        throw new IllegalStateException("Invalid State-Card not inserted");
    }

    @Override
    public void checkBalance() {
        throw new IllegalStateException("Invalid State-Card not inserted");
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("Invalid State-Card not inserted");
    }
}
