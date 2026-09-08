public class SugarDecorator extends CoffeeDecorator{
    private Coffee coffee;
    public SugarDecorator(Coffee coffee){
        this.coffee=coffee;
    }
    @Override
    public double getPrice() {
        return coffee.getPrice()+2.5;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+", Sugar";
    }
}
