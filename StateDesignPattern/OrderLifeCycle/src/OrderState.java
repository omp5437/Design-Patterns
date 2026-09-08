abstract class OrderState implements State{
    protected Order order;
    protected OrderState(Order order){
        this.order=order;
    }
}
