
import java.util.List;

public class ExportService {
    private ExportStrategy exportStrategy;

    public ExportService() {

    }

    public void setExportStrategy(ExportStrategy exportStrategy) {
        if (exportStrategy != null)
            this.exportStrategy = exportStrategy;
        else {
            throw new RuntimeException("Unable to resolve exportStrategy");
        }
    }

    public String export(List<String> rows) {
        return this.exportStrategy.export(rows);
    }
}
