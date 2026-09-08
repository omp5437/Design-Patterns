public class AuthenticatedState extends ATMMachineState{
    protected AuthenticatedState(ATMMachine machine) {
        super(machine);
    }

    @Override
    public String getCurrentState() {
        return "Authenticated State";
    }

    @Override
    public void insertCard() {
     throw new IllegalStateException("Invalid State-Card already inserted");
    }

    @Override
    public void enterPin() {
        throw new IllegalStateException("Invalid State-Pin already entered");
    }

    @Override
    public void verifyPin(String verify) {
        throw new IllegalStateException("Invalid State-Pin already verified");
    }

    @Override
    public void withDraw(double amount) {
        System.out.println("Amount withdrawal successful "+amount);
    }

    @Override
    public void checkBalance() {
        System.out.println("Current balance amount ");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected");
        super.machine.setState(new NoCardState(super.machine));
    }
}
