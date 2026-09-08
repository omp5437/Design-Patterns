public class CreateState extends OrderState {

    public CreateState(StateManager manager) {
        super(manager);
    }

    @Override
    public void create() {

    }

    @Override
    public void pay() {
        if(super.manager.getOrder().getStatus().equals("CREATED")){
            super.manager.getOrder().setStatus("PAID");
            super.manager.setState(new PayState(super.manager));
            System.out.println("Current status: "+super.manager.getOrder().getStatus());

        }else{
            throw new IllegalStateException("Invalid Status");
        }
    }

    @Override
    public void ship() {
        throw new IllegalStateException("Invalid State");
    }

    @Override
    public void cancel() {
        super.manager.getOrder().setStatus("CANCELLED");

        System.out.println("Current status: "+super.manager.getOrder().getStatus());

    }

    @Override
    void undo() {
        super.manager.setState(new CreateState(super.manager));
        super.manager.getOrder().setStatus("CREATED");
        System.out.println("Current status: "+super.manager.getOrder().getStatus());
    }
}
