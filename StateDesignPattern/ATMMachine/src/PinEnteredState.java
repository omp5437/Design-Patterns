public class PinEnteredState extends ATMMachineState{
    protected PinEnteredState(ATMMachine machine) {
        super(machine);
    }
    private String correctPin="1234";
    private int failedAttempt=0;
    @Override
    public String getCurrentState() {
        return "Pin Entered State";
    }

    @Override
    public void insertCard() {
    throw new IllegalStateException("Inavlid State- Card already inserted");
    }

    @Override
    public void enterPin() {
        throw new IllegalStateException("Inavlid State- Pin entered");
    }

    @Override
    public void verifyPin(String pin) {
        if(pin.equals(correctPin)){
            System.out.println("Pin Verified");
            super.machine.setState(new AuthenticatedState(super.machine));
        }else{
            failedAttempt++;
            System.out.println("Invalid Pin attempt "+failedAttempt);
            if(failedAttempt==3){
                System.out.println("Ejecting card");
                super.machine.ejectCard();
            }

        }

    }

    @Override
    public void withDraw(double amount) {
     throw new IllegalStateException("Invalid State- Unauthenticated");
    }

    @Override
    public void checkBalance() {
        throw new IllegalStateException("Invalid State- Unauthenticated");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected");
        super.machine.setState(new NoCardState(super.machine));
    }
}
