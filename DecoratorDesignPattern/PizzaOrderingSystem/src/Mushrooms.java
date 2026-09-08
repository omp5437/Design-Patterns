public class Mushrooms extends PizzaDecorator{
    public Mushrooms(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double price() {
        return super.pizza.price()+70.0;
    }

    @Override
    public String getDescription() {
        return super.pizza.getDescription()+", Mushrooms";
    }
}
