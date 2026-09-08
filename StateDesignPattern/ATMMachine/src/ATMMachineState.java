abstract class ATMMachineState implements ATMState{
    protected ATMMachine machine;
    protected ATMMachineState(ATMMachine machine){
        this.machine=machine;
    }

}
