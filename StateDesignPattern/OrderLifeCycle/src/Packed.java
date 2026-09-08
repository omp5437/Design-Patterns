public class Packed extends OrderState{
    public Packed(Order order) {
        super(order);
    }

    @Override
    public String getDescription() {
        return "Packed State";
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
      System.out.println("Order shipped");
      super.order.setState(new Shipped(order));
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
