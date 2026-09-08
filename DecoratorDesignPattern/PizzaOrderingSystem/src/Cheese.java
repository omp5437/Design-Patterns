public class Cheese extends PizzaDecorator{
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double price() {
        return super.pizza.price()+30.0;
    }

    @Override
    public String getDescription() {
        return super.pizza.getDescription()+", Cheese";
    }
}
