import java.util.ArrayList;
import java.util.List;

public class DiscountContext {
    private List<DiscountStrategy> discountStrategies;

    public DiscountContext(){
        this.discountStrategies=new ArrayList<>();
    }

    public void addDiscountStartegy(DiscountStrategy discountStrategy){
        this.discountStrategies.add(discountStrategy);
    }

    public double applyDiscount(double amount){

        for(DiscountStrategy ds:this.discountStrategies){
             amount=ds.applyDiscount(amount);
        }
        return amount;
    }
}
