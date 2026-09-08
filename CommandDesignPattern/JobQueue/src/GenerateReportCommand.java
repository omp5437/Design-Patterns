public class GenerateReportCommand implements Command{
    private String report;
    public GenerateReportCommand(String report){
        this.report=report;
    }
    @Override
    public void execute() {
        System.out.println("Report generated: "+report);
    }




}
