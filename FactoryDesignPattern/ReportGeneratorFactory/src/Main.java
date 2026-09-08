import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ReportGeneratorFactory factory=new ReportGeneratorFactory();
        factory.register("CSV", (()->new CsvReportGenerator()));
        factory.register("PDF",(()->new PdfReportGenerator()));
        factory.register("HTML",(()->new HtmlReportGenerator()));
        factory.register("JSON",(()->new JSONReportGenerator()));
        while(true){
            String type=sc.next();
            ReportGenerator reportGenerator=factory.get(type);
            reportGenerator.generate();
        }
    }
}