public class CreateOrderCommand implements Command{
    private StateManager stateManager;
    public CreateOrderCommand(StateManager stateManager){
        this.stateManager=stateManager;
    }
    @Override
    public void execute() {
        stateManager.create();
    }

    @Override
    public void undo() {
        stateManager.undo();
    }
}
