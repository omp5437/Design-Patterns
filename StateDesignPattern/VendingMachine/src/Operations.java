public class Operations {
    private State state;
    public Operations(){
        state=new IdleState(this);
    }

    public String getDescription() {
        return this.state.getDescription();
    }


    public void insertCoin(double amount) {
       this.state.insertCoin(amount);
    }


    public void selectProduct() {
       this.state.selectProduct();
    }

    public void dispense() {
       this.state.dispense();
    }
    public void cancel() {
        this.state.cancel();
    }
    public void setState(State state){
        this.state=state;
    }
    public void reset(){
       this.state.reset();
    }
}
