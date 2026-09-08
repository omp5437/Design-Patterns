public class InitialState extends OrderState{
    protected InitialState(StateManager manager) {
        super(manager);
    }

    @Override
    void create() {
        if(super.manager.getOrder().getStatus().equals("INITIATED")) {
            super.manager.setState(new CreateState(super.manager));
            super.manager.getOrder().setStatus("CREATED");
            System.out.println("Current status: "+super.manager.getOrder().getStatus());
        }else{
            throw new IllegalStateException("Invalid State");
        }
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
        throw new IllegalStateException("Invalid State");
    }

    @Override
    void undo() {
        throw new IllegalStateException("Invalid State");
    }


}
