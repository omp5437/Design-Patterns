public class WarehouseNotification implements Notification{
    @Override
    public void update(Order order) {
        System.out.println("Warehouse- " +order.getId()+ "  current order status: "+order.getStatus());
    }
}
