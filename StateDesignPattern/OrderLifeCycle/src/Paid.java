

public class Paid extends OrderState{
    public Paid(Order order) {
        super(order);
    }

    @Override
    public String getDescription() {
        return "Paid State";
    }

    @Override
    public void pay(Order order) {
        throw new IllegalStateException("Invalid State");
    }

    @Override
    public void pack(Order order) {
        System.out.println("Order packed");
        super.order.setState(new Packed(order));
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
