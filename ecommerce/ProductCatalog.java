package ecommerce;
import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    private List<String> products;

    public ProductCatalog() {
        products = new ArrayList<>();
        products.add("iPhone 15 Pro Max");
        products.add("iPhone Charger");
        products.add("Samsung Galaxy S24");
        products.add("Sony Headphones");
        products.add("Dell XPS Laptop");
        products.add("Apple MacBook Air");
        products.add("Realme Wireless Earbuds");
        products.add("Canon DSLR Camera");
    }

    public List<String> search(String keyword) {
        List<String> result = new ArrayList<>();
        for(String product : products) {
            if(product.toLowerCase().contains(keyword.toLowerCase())) {
                result.add(product);
            }
        }
        return result;
    }
}
