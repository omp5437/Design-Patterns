import java.util.ArrayList;
import java.util.List;

public class ConfigRepository {
   static List<StorageConfig> configurations;

    public ConfigRepository(){
        configurations=new ArrayList<>();
    }
    public static StorageConfig getConfigurations(String userName, String password){
        for(StorageConfig s: configurations){
            s.toString();
            if(s.getUserName().equals(userName) && s.getPassWord().equals(password))
                return s;
        }
        throw new IllegalArgumentException("Invalid credentials "+ userName);
    }

    public void setConfigurations(){
        configurations.add(new StorageConfig(StorageType.S3,"aws.com","S3/container1","user1","user1"));
        configurations.add(new StorageConfig(StorageType.AZURE,"azure.com", "AZURE_BLOB/container2", "user2", "user2"));
        configurations.add(new StorageConfig(StorageType.AZURE,"azure.com", "AZURE_BLOB/container3", "user3", "user3"));
        configurations.add(new StorageConfig(StorageType.GCS,"gcp.com", "GCS/container4", "user4", "user4"));
        configurations.add(new StorageConfig(StorageType.GCS,"gcp.com", "GCS/container5", "user5", "user5"));
    }
}
