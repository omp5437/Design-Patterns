//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Order order=new Order();
       System.out.println(order.getStateDescription());
       order.pay();
       System.out.println(order.getStateDescription());
       order.pack();
        System.out.println(order.getStateDescription());
       order.ship();
        System.out.println(order.getStateDescription());
       order.deliver();
       System.out.println(order.getStateDescription());





    }
}