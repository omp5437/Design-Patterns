import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      ConfigRepository repository=new ConfigRepository();
      repository.setConfigurations();
      Scanner sc=new Scanner(System.in);
      while(true){
          String type=sc.next();
          String endPoint=sc.next();
          String container=sc.next();
          String username=sc.next();
          String password=sc.next();
          StorageConfig config=new StorageConfig(StorageType.valueOf(type),endPoint,container,username,password);
          StorageService service=StorageServiceFactory.create(config);
          String filename=sc.nextLine();
          service.upload(filename);
      }
    }
}