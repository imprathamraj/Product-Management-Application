import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> products = new ArrayList<>();

    // Adding product
    public void addProduct(Product product) {
        products.add(product);
    }

    // Getting all product
    public List<Product> getAllProduct() {
        return products;
    }

    // Getting product with a particular name
    public Product getProduct(String name){
        for(Product p: products){
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }
}
