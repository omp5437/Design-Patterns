public class CancelOrderCommand implements Command{
    private StateManager stateManager;
    public CancelOrderCommand(StateManager stateManager){
        this.stateManager=stateManager;
    }
    @Override
    public void execute() {
       stateManager.cancel();
    }

    @Override
    public void undo() {
       stateManager.undo();
    }
}
