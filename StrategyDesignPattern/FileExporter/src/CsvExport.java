import java.util.List;

public class CsvExport implements ExportStrategy{
    @Override
    public String export(List<String> rows) {
        return String.join(", \n",rows);
    }
}
