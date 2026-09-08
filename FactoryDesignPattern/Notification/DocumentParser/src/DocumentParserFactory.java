public class DocumentParserFactory {

    public static DocumentParser create(String path){
        if(!path.contains("."))
            throw new IllegalArgumentException("Unsupported path type: "+path);

        String extension=path.split("[.]")[1];
        switch (extension){
            case "pdf": return new PdfParser();
            case "docx": return new WordParser();
            case "xlsx": return new ExcelParser();
             default: throw new IllegalArgumentException("Unsupported type: "+extension);

        }
    }
}
