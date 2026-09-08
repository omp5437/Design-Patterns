public class WhippedCreamDecorator extends CoffeeDecorator{
    private Coffee coffee;
    public WhippedCreamDecorator(Coffee coffee){
        this.coffee=coffee;
    }
    @Override
    public double getPrice() {
        return coffee.getPrice()+5.0;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+", WhippedCream";
    }
}
