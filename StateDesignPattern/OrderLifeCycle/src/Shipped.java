public class Shipped extends OrderState{
    public Shipped(Order order) {
        super(order);
    }

    @Override
    public String getDescription() {
        return "Shipped State";
    }

    @Override
    public void pay(Order order) {
        throw new IllegalStateException("Invalid State");
    }

    @Override
    public void pack(Order order) {
        throw new IllegalStateException("Invalid State");
    }

    @Override
    public void ship(Order order) {
        throw new IllegalStateException("Invalid State");
    }

    @Override
    public void deliver(Order order) {
       System.out.println("Order delivered");
       super.order.setState(new Delivered(order));
    }

    @Override
    public void cancel(Order order) {
        throw new IllegalStateException("Invalid State");
    }


}
