public class Order {
    private State state;
    public Order(){
        state=new Created(this);
    }
    public void setState(State state){
        this.state=state;
    }

    public void pay(){
        this.state.pay(this);
    }
    public void pack(){
        this.state.pack(this);
    }
    public void ship(){
        this.state.ship(this);
    }

    public void deliver(){
        this.state.deliver(this);
    }
    public void cancel(){
        this.state.cancel(this);
    }
    public String getStateDescription(){
        return this.state!=null?this.state.getDescription():"Empty state";
    }
}
