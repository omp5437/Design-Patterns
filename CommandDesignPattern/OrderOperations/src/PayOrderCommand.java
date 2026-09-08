public class PayOrderCommand implements Command{
    private StateManager stateManager;
    public PayOrderCommand(StateManager stateManager){
        this.stateManager=stateManager;
    }
    @Override
    public void execute() {
       stateManager.pay();
    }

    @Override
    public void undo() {
        stateManager.undo();
    }
}
