public class ATMMachine {
    private static final ATMMachine instance=new ATMMachine();
    private ATMState state;
    private ATMMachine(){
      state=new NoCardState(this);
    }

    public static ATMMachine getInstance(){
        return instance;
    }

    public void setState(ATMState state){
        this.state=state;
    }

    String getCurrentState(){
       return this.state.getCurrentState();
    }
    void insertCard(){
        this.state.insertCard();
    }
    void enterPin(){
        this.state.enterPin();
    }
    void verifyPin(String pin){
        this.state.verifyPin(pin);
    }
    void withDraw(double amount){
        this.state.withDraw(amount);
    }
    void checkBalance(){
        this.state.checkBalance();
    }
    void ejectCard(){
        this.state.ejectCard();
    }
}
