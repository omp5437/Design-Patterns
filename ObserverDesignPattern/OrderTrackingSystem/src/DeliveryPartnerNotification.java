public class DeliveryPartnerNotification implements Notification{
    @Override
    public void update(Order order) {
        System.out.println("Delivery Partner- " +order.getId()+ "  current order status: "+order.getStatus());
    }
}
