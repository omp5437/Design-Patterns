import java.util.HashMap;
import java.util.function.Supplier;

public class ExportFactory {
    private HashMap<String, Supplier<ExportStrategy>> registry;
    public ExportFactory(){
        this.registry=new HashMap<>();
    }

    public void register(){
       registry.put("csv",()->new CsvExport());
       registry.put("xml",()->new XmlExport());
       registry.put("json",()->new JsonExport());
    }

    public ExportStrategy getStrategy(String type){
       Supplier<ExportStrategy> strategy=registry.get(type);
       if(strategy==null)
           throw new IllegalArgumentException("type mismatch");
       return strategy.get();
    }
}
