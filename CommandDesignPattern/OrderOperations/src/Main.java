
public class Main {
    public static void main(String[] args) {
        OrderOperation operation=new OrderOperation();
        Order order=new Order(1,260.55,"Delhi");
        StateManager stateManager=new StateManager(order);
        Command create=new CreateOrderCommand(stateManager);
        create.execute();

        Command cancel=new CancelOrderCommand(stateManager);
        cancel.execute();
        Command pay=new PayOrderCommand(stateManager);
        pay.execute();

        Command ship=new ShipOrderCommand(stateManager);
        ship.execute();







    }
}