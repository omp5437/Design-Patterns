public class StorageConfig {
   private StorageType type;
   private String endPoint;
   private String bucket;
   private String userName;
   private String passWord;

    public String getEndPoint() {
        return endPoint;
    }

    public String getBucket() {
        return bucket;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }
    public StorageType getType() {
        return type;
    }

    public StorageConfig(StorageType type,String endPoint, String bucket, String userName, String passWord) {
        this.type=type;
        this.endPoint = endPoint;
        this.bucket = bucket;
        this.userName = userName;
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "StorageConfig{" +
                "endPoint='" + endPoint + '\'' +
                ", bucket='" + bucket + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
