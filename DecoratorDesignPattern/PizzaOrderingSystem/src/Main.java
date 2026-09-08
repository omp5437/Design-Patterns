//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         Pizza pizza=new Cheese(new Olives(new Jalpeno(new ExtraCheese(new Farmhouse()))));
         System.out.println("Price "+pizza.price());
         System.out.println(pizza.getDescription());
    }
}