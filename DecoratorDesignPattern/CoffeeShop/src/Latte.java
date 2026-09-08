public class Latte implements Coffee{
    @Override
    public double getPrice() {
        return 20.0;
    }
    @Override
    public String getDescription() {
        return "Latte";
    }
}
