import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class JobQueue {
    private BlockingQueue<Command> queue;
    public JobQueue(){
        queue=new ArrayBlockingQueue(2);
    }

    public void addJob(Command command){
        try {
            queue.put(command);
        }catch (InterruptedException e){
            System.out.println("Error while adding to queue "+e.getMessage());
        }
    }
    public void execute(){
        while(true){
            try {
                Command command = queue.take();
                if(command instanceof StopJobCommand){
                    queue.put(command);
                    break;
                }
                int attempt=0;
                int maxAttempt=3;
                boolean success=false;
                while(attempt<maxAttempt && !success){
                    attempt++;
                    try {
                        command.execute();
                        success=true;
                    }catch (Exception e){
                        System.out.println("Retried command:"+attempt+" "+command.getClass().getSimpleName());
                        if(attempt==maxAttempt){
                            System.out.println("Command failed:"+command.getClass().getSimpleName());
                        }
                    }

                }

            }catch (InterruptedException e){
                System.out.println("Error while consuming "+e.getMessage());
            }
        }
    }

}
