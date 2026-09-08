

public class SendEmailCommand implements Command{
    private String message;
    public SendEmailCommand(String message){
        this.message=message;
    }
    @Override
    public void execute() {
       this.sendEmail(this.message);
    }

    public void sendEmail(String message){
        System.out.println("Email sent: "+message);
    }

}
