public class Delivered extends OrderState{
    public Delivered(Order order) {
        super(order);
    }

    @Override
    public String getDescription() {
        return "Delivered State";
    }

    @Override
    public void pay(Order order) {

    }

    @Override
    public void pack(Order order) {

    }

    @Override
    public void ship(Order order) {

    }

    @Override
    public void deliver(Order order) {

    }

    @Override
    public void cancel(Order order) {

    }

}
