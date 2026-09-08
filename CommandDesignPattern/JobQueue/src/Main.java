
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        JobQueue jobQueue = new JobQueue();
        String email = new String("This is a new email");
        String paymentinfo = new String("Payment amount=100");
        String report = new String("Report is good");
        Command sendEmail = new SendEmailCommand(email);
        Command generateReport = new GenerateReportCommand(report);
        Command processPayment = new ProcessPaymentCommand(paymentinfo);
        Command generateInvoice = new GenerateInvoice(null);

        ExecutorService submitJob = Executors.newFixedThreadPool(2);
        ExecutorService executeJob = Executors.newFixedThreadPool(2);

        submitJob.submit(() -> {
            jobQueue.addJob(sendEmail);
            jobQueue.addJob(generateReport);
            jobQueue.addJob(processPayment);
            jobQueue.addJob(generateInvoice);

        });
        executeJob.submit(()->{
            jobQueue.execute();
        });

        submitJob.submit(()->{
            jobQueue.addJob(new StopJobCommand());
        });
        submitJob.shutdown();
        executeJob.shutdown();

    }
}