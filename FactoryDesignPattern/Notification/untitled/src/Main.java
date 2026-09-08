import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         NotificationFactory factory=new NotificationFactory();
         while(true) {
             Scanner sc=new Scanner(System.in);
             String s=sc.nextLine();
             NotificationType type=NotificationType.DEFAULT;
             if(s.equals("PUSH")){
                 type=NotificationType.PUSH;
             }

             if(s.equals("EMAIL")){
                 type=NotificationType.EMAIL;
             }

             if(s.equals("SMS")){
                 type=NotificationType.SMS;
             }
             Notification notification = factory.create(type);
             if (notification != null)
                 notification.send("This is the new notification");
             else {
                 System.out.println("Wrong input");
             }
         }

    }
}