public class OrderOperation {
    private Command command;


    public void setCommand(Command command) {
        this.command = command;
    }
    public void performOperation(){
        command.execute();
    }

    public void reverseOperation(){
        command.undo();
    }
}
