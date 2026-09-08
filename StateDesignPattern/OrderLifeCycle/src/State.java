public interface State {
    String getDescription();
    public void pay(Order order);
    public void pack(Order order);
    public void ship(Order order);
    public void deliver(Order order);
    public void cancel(Order order);
}
