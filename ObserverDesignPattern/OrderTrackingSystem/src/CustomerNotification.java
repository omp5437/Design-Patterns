public class CustomerNotification implements Notification{
    @Override
    public void update(Order order) {
          System.out.println("Customer- " +order.getId()+ "  current order status: "+order.getStatus());
    }
}
