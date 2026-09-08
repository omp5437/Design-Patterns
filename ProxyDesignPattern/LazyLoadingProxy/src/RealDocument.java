public class RealDocument implements  Document{
    private String file;
    public RealDocument(String file){
        this.file=file;
        System.out.println("Loading file...");
    }
    @Override
    public void display() {
      System.out.println("Displaying file content...");
    }
}
