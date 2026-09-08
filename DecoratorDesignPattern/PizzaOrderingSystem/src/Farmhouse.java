public class Farmhouse implements Pizza{
    @Override
    public double price() {
        return 150.00;
    }

    @Override
    public String getDescription() {
        return "Farm house";
    }
}
