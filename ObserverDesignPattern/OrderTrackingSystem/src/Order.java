public class Order {
    private final String id;
    private double amount;
    private String item;
    private OrderStatus status;
    private final NotificationManager manager;
    public Order(String id,double amount, String item, OrderStatus status,NotificationManager manager){
        this.id=id;
        this.amount=amount;
        this.item=item;
        this.status=status;
        this.manager=manager;
    }

    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public OrderStatus getStatus() {

        return status;
    }

    public void setStatus(OrderStatus status) {
        if(this.status==status)
            return;

        this.status = status;
        manager.notify(NotificationType.ORDER_STATUS_UPDATE,this);

    }
}
