import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {

    private Map<String, Integer> priceOfProd;
    private Map<String, Integer> stockOfProd;

    public Storehouse() {
        priceOfProd = new HashMap<String, Integer>();
        stockOfProd = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock){
        this.priceOfProd.put(product, price);
        this.stockOfProd.put(product, stock);
    }

    public int price(String product){
        if(this.priceOfProd.containsKey(product)){
            return this.priceOfProd.get(product);
        }
        return -99;
    }

    public int stock(String product){
        if(this.stockOfProd.containsKey(product)){
            return this.stockOfProd.get(product);
        }
        return 0;
    }

    public boolean take(String product){
        if(this.stockOfProd.containsKey(product)){
            if(this.stockOfProd.get(product) > 0) {
                int currentStock = this.stockOfProd.get(product);
                currentStock--;
                this.stockOfProd.put(product, currentStock);
                return true;
            }
        }
        return false;
    }

    public Set<String> products(){
        return this.priceOfProd.keySet();
    }
}
