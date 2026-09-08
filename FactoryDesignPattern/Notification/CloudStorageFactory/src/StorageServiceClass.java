import java.util.List;

abstract class StorageServiceClass implements StorageService {
    protected void validate(StorageConfig config){
           StorageConfig configFound=ConfigRepository.getConfigurations(config.getUserName(), config.getPassWord());
           System.out.println("Credentials validated");
    }


}
