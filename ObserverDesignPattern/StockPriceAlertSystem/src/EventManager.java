import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EventManager {
    private HashMap<String, List<Investor>> events;

    public EventManager(){
        events=new HashMap<>();
    }

    public void notifyEvents(Stock stock){
        List<Investor> ls=events.get(stock.getStockName());
        if(ls==null)
            return;
        for(Investor i:ls){
            try {
                i.update(stock);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public void subscribe(Stock stock, Investor investor){
        List<Investor> ls=events.getOrDefault(stock.getStockName(),new ArrayList<>());
        ls.add(investor);
        events.put(stock.getStockName(),ls);

    }
    public void unSubscribe(Stock stock, Investor investor){
          List<Investor> ls=events.get(stock.getStockName());
          if(ls==null)
              return;
          int index=-1;
          for(int i=0;i<ls.size();++i){
              if(ls.get(i).equals(investor)){
                  index=i;
                  break;
              }
          }
          if(index==-1){
              throw new IllegalArgumentException("Unsupported type: ");
          }
          ls.remove(index);
    }

}
