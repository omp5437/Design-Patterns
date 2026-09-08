import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> rows=new ArrayList<>();
        rows.add("This is to be exported");
        rows.add("I am good at Strategy pattern.");
        rows.add("I am going to master the LLD.");
        rows.add("Trust me I am a good programmer");
        rows.add("I am good disciple");

        ExportService exportService=new ExportService();
        ExportFactory factory=new ExportFactory();
        factory.register();
        Scanner sc=new Scanner(System.in);
        while(true){
            String strategy=sc.nextLine();
            ExportStrategy exportStrategy=factory.getStrategy(strategy);
            exportService.setExportStrategy(exportStrategy);
            String output=exportStrategy.export(rows);
            System.out.println(output);
        }


    }
}