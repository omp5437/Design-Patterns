public class AzureBlobStorageService extends StorageServiceClass{
    public AzureBlobStorageService(StorageConfig config){
        super.validate(config);
    }
    @Override
    public void upload(String fileName) {
        System.out.println("File upload successful in Azure");
    }

    @Override
    public void download(String fileName) {
        System.out.println("File download successful from Azure");
    }
}
