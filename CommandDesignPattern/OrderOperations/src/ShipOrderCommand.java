public class ShipOrderCommand implements Command{
    private StateManager stateManager;
    public ShipOrderCommand(StateManager stateManager){
       this.stateManager=stateManager;
    }
    @Override
    public void execute() {
        stateManager.ship();
    }

    @Override
    public void undo() {
        stateManager.undo();
    }
}
