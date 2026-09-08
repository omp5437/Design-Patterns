

public class Main {
    public static void main(String[] args) {
        NotificationManager notificationManager=new NotificationManager();
        Order order1=new Order("O-1",2449.00,"Shoes",OrderStatus.PENDING,notificationManager);
        Order order2=new Order("O-2",1236.00,"T-shirt",OrderStatus.PENDING,notificationManager);

        Notification customerNotification=new CustomerNotification();
        Notification warehouseNotification=new WarehouseNotification();
        Notification deliveryPartnerNotification=new DeliveryPartnerNotification();

        notificationManager.subscribe(NotificationType.ORDER_STATUS_UPDATE,customerNotification);
        notificationManager.subscribe(NotificationType.ORDER_STATUS_UPDATE,warehouseNotification);
        notificationManager.subscribe(NotificationType.ORDER_STATUS_UPDATE,deliveryPartnerNotification);

        order1.setStatus(OrderStatus.PLACED);

        order2.setStatus(OrderStatus.PLACED);
        order1.setStatus(OrderStatus.PACKED);
        order1.setStatus(OrderStatus.SHIPPED);
        order2.setStatus(OrderStatus.PACKED);
        order2.setStatus(OrderStatus.PACKED); //check for duplicate status change
        order2.setStatus(OrderStatus.SHIPPED);
        notificationManager.unSubscribe(NotificationType.ORDER_STATUS_UPDATE,warehouseNotification); //checking if unsubscribe working fine.
        order1.setStatus(OrderStatus.DELIVERED);
        order2.setStatus(OrderStatus.DELIVERED);



    }
}