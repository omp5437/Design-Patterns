public class Margherita implements Pizza{
    @Override
    public double price() {
        return 100.00;
    }

    @Override
    public String getDescription() {
        return "Margherita";
    }
}
