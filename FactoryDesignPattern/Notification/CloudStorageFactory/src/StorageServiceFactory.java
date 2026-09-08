public class StorageServiceFactory{

    public static StorageService create(StorageConfig config){

           switch (config){
               case StorageConfig s when s.getType()==StorageType.S3 && s.getEndPoint().startsWith("aws") && s.getBucket().startsWith("S3"):
                   return new S3StorageService(config);
               case StorageConfig s when s.getType()==StorageType.AZURE && s.getEndPoint().startsWith("azure") && s.getBucket().startsWith("AZURE_BLOB"):
                   return new AzureBlobStorageService(config);
               case StorageConfig s when s.getType()==StorageType.GCS && s.getEndPoint().startsWith("gcp") && s.getBucket().startsWith("GCS"):
                   return new GCSStorageService(config);
               default:
                   throw new IllegalArgumentException("Wrong configuration: "+config.toString());
           }
    }

}
