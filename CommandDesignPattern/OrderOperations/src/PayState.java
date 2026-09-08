public class PayState extends OrderState{
    protected PayState(StateManager manager) {
        super(manager);
    }

    @Override
    void create() {
        throw new IllegalStateException("Invalid State");
    }

    @Override
    void pay() {

    }

    @Override
    void ship() {
        if(super.manager.getOrder().getStatus().equals("PAID")){
            super.manager.getOrder().setStatus("SHIPPED");
            super.manager.setState(new ShipState(super.manager));
            System.out.println("Current status: "+super.manager.getOrder().getStatus());
        }else{
            throw new IllegalStateException("Invalid Status");
        }
    }

    @Override
    void cancel() {
//        System.out.println("Order cancelled");
        super.manager.getOrder().setStatus("CANCELLED");
        System.out.println("Current status: "+super.manager.getOrder().getStatus());
    }

    @Override
    void undo() {
        super.manager.getOrder().setStatus("PAID");
        super.manager.setState(new PayState(super.manager));
        System.out.println("Current status: "+super.manager.getOrder().getStatus());
    }
}
