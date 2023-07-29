package listProducts;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Products> products = new ArrayList<>();
        products.add(new Products(4500, 4));
        products.add(new Products(25000.78, 35));
        products.add(new Products(8700, 12));
        products.add(new Products(9200, 7));

        double total = products.stream()
                .mapToDouble(product -> product.getPrice() * product.getQuantity())
                .sum();
        System.out.println("Grand total = " + total);
    }
}
