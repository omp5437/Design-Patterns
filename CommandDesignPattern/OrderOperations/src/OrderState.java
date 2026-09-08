public abstract class OrderState {
    protected StateManager manager;
    protected OrderState(StateManager manager){
        this.manager=manager;
    }
    abstract void create();
    abstract void pay();
    abstract void ship();
    abstract void cancel();
    abstract void undo();
}
