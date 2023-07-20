package superMarket;

import java.util.ArrayList;
import java.util.List;

public class superMarketBag<T> extends Product {
    private List<T> products;

    public superMarketBag() {
        super();
        products = new ArrayList<>();
    }

    public void addProduct(T product) {
        if (products.size() < 5) {
            products.add(product);
        }else {
            System.out.println("The bag is full, not is possible add more products");
        }
    }
    public List<T> getProducts(){
        return products;
    }
}
