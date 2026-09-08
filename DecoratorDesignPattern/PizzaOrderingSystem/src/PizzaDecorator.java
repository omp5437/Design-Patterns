abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;
    protected PizzaDecorator(Pizza pizza){
        this.pizza=pizza;
    }

}
