public class Order {
    private int orderId;
    private double amount;
    private String address;
    private String status;

    public Order(int orderId, double amount, String address) {
        this.orderId = orderId;
        this.amount = amount;
        this.address = address;
        this.status="INITIATED";
    }

    public int getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }

    public String getAddress() {
        return address;
    }

    public void setStatus(String status) {

        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }


    
    
}
