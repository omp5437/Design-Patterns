public class Created extends OrderState{
    public Created(Order order) {
        super(order);
    }

    @Override
    public String getDescription() {
        return "Created State";
    }

    @Override
    public void pay(Order order) {
        System.out.println("Order amount paid");
        super.order.setState(new Paid(order));
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
        throw new IllegalStateException("Invalid State");
    }

    @Override
    public void cancel(Order order) {
        throw new IllegalStateException("Invalid State");
    }


}
