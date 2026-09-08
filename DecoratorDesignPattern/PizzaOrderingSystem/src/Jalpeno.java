public class Jalpeno extends PizzaDecorator{
    public Jalpeno(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double price() {
        return super.pizza.price()+25.0;
    }

    @Override
    public String getDescription() {
        return super.pizza.getDescription()+", Jalpeno";
    }
}
