public class DocumentProxy implements Document {
    private RealDocument document;
    private String file;

    public DocumentProxy(String file) {
        this.file = file;
        System.out.println("Creating proxy first...");
    }

    @Override
    public void display() {
        if (document == null)
            document = new RealDocument(file);
        document.display();
    }
}
