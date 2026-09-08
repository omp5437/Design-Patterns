abstract class VendingState implements State {
    protected Operations operations;
    public VendingState(Operations operations){
        this.operations=operations;
    }
}
