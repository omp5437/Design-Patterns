//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Operations operations=new Operations();
        System.out.println(operations.getDescription());
        operations.insertCoin(5.0);
        System.out.println(operations.getDescription());

        System.out.println(operations.getDescription());
        operations.selectProduct();
        System.out.println(operations.getDescription());
        operations.dispense();
        System.out.println(operations.getDescription());
        operations.reset();
        System.out.println(operations.getDescription());


    }
}