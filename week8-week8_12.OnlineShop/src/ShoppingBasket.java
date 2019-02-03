import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ShoppingBasket {

    private Map<String, Purchase> basket;

    public ShoppingBasket() {
        this.basket = new HashMap< String, Purchase>();
    }

    public void add(String product, int price){
        if(this.basket.containsKey(product)){
            Purchase purchase = this.basket.get(product);
            purchase.increaseAmount();
            this.basket.replace(product, purchase);
        }else

        this.basket.put(product, new Purchase(product, 1, price));
    }

    public int price(){
        int totalPrice = 0;
        for(Purchase p : this.basket.values()){
            totalPrice += p.price();
        }
        return totalPrice;
    }

    public void print(){
        for(Purchase p : this.basket.values()){
            System.out.println(p);
        }
    }
}
