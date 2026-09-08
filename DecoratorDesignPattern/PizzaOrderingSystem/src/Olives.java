public class Olives extends PizzaDecorator{
    public Olives(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double price() {
        return super.pizza.price()+55.0;
    }

    @Override
    public String getDescription() {
        return super.pizza.getDescription()+", Olives";
    }
}
