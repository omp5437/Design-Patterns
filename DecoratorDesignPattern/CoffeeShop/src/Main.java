//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Coffee coffee=new WhippedCreamDecorator(new MilkDecorator(new SugarDecorator(new Espresso())));

        System.out.println(coffee.getPrice());
        System.out.println(coffee.getDescription());

    }
}