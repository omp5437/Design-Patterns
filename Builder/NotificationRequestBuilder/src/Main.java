import java.time.Instant;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NotificationRequest request = new NotificationRequest.Builder()
                .userId("mstar").message("This is a test message")
                .metadata("metadata").priority(1).templateId("EMAIL_TEMPLATE")
                .channel("Email").scheduledAt(Instant.now()).build();

        System.out.println(request.toString());


    }
}