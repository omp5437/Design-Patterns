//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ATMMachine machine = ATMMachine.getInstance();
        System.out.println(machine.getCurrentState());
        machine.insertCard();
        System.out.println(machine.getCurrentState());
        machine.enterPin();
        System.out.println(machine.getCurrentState());
        machine.verifyPin("2345");
        machine.verifyPin("1235");
        machine.verifyPin("1233");
        machine.insertCard();
        machine.enterPin();
        machine.verifyPin("1233");
        machine.verifyPin("1234");
        System.out.println(machine.getCurrentState());
        machine.withDraw(500);
        System.out.println(machine.getCurrentState());
        machine.checkBalance();
        System.out.println(machine.getCurrentState());
        machine.ejectCard();
        System.out.println(machine.getCurrentState());
    }
}