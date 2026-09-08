public class ShipState extends OrderState{
    protected ShipState(StateManager manager) {
        super(manager);
    }

    @Override
    void create() {
        throw new IllegalStateException("Invalid State");
    }

    @Override
    void pay() {
        throw new IllegalStateException("Invalid State");
    }

    @Override
    void ship() {
        throw new IllegalStateException("Invalid State");
    }

    @Override
    void cancel() {
        throw new IllegalStateException("Invalid State-Order shipped cannot be cancelled");
    }

    @Override
    void undo() {
        throw new IllegalStateException("Invalid State-Order shipped cannot be undone");
    }
}
