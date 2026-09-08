public class StateManager {
    private OrderState state;
    private Order order;
    public StateManager(Order order){
        this.order=order;
        this.state=new InitialState(this);
    }

    public void setState(OrderState state){
        this.state=state;
    }

    public void create() {
      this.state.create();
    }

    public Order getOrder(){
        return this.order;
    }


    public void pay() {
    this.state.pay();
    }


    public void ship() {
     this.state.ship();
    }


    public void cancel() {
     this.state.cancel();
    }
    public void undo(){
        this.state.undo();
    }
}
