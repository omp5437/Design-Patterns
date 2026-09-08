public class Espresso implements Coffee{
    @Override
    public double getPrice() {
        return 20.0;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }

}
