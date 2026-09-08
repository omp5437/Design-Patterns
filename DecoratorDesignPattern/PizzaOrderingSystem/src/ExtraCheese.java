public class ExtraCheese extends PizzaDecorator{
    public ExtraCheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double price() {
        return super.pizza.price()+50.0;
    }

    @Override
    public String getDescription() {
        return super.pizza.getDescription()+", Extra Cheese";
    }
}
