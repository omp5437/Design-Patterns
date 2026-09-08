//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ReportRequest request=new ReportRequest.Builder().reportType("sales")
                .userId("user-1").build();
        System.out.println(request.toString());

    }
}