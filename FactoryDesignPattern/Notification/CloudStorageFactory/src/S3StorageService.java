public class S3StorageService extends StorageServiceClass{
    public S3StorageService(StorageConfig config){
        super.validate(config);
    }
    @Override
    public void upload(String fileName) {
        System.out.println("File upload successful in AWS");
    }

    @Override
    public void download(String fileName) {
        System.out.println("File download successful from AWS");
    }
}
