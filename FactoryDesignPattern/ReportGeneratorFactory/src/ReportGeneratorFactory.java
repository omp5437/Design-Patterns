import java.util.HashMap;
import java.util.function.Supplier;

public class ReportGeneratorFactory {
   private HashMap<String,Supplier<ReportGenerator>> registry;
    public ReportGeneratorFactory(){
        registry=new HashMap<>();
    }
    void register(String type, Supplier<ReportGenerator> supplier){
        registry.put(type, supplier);
    }
    public ReportGenerator get(String type){
       Supplier<ReportGenerator> supplier=registry.get(type);
       if(supplier==null)
           throw  new IllegalArgumentException("Unsupported type: "+type);
         return supplier.get();
    }
}
