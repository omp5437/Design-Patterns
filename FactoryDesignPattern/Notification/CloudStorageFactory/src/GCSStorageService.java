public class GCSStorageService extends StorageServiceClass{
    public GCSStorageService(StorageConfig config){
        super.validate(config);
    }
    @Override
    public void upload(String fileName) {
        System.out.println("File upload successful in Google Cloud");
    }

    @Override
    public void download(String fileName) {
        System.out.println("File download successful from Google Cloud");
    }
}
