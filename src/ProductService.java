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
    public Product getProductByName(String name){
        for(Product p: products){
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }

    // Getting product with a particular place
    public List<Product> getProductByPlace(String place){
        List<Product> productList = new ArrayList<>();
        for(Product p: products){
            if(p.getPlace().equals(place)){
                productList.add(p);
            }
        }
        return productList;
    }

    // Getting product with a particular type
    public List<Product> getProductByType(String type){
        List<Product> productList = new ArrayList<>();
        for(Product p: products){
            if(p.getType().equals(type)){
                productList.add(p);
            }
        }
        return productList;
    }

    // Getting product with expired warranty
    public List<Product> getProductByExpiredWarranty() {
        List<Product> productList = new ArrayList<>();
        for(Product p: products){
            if(p.getWarranty()<2025){
                productList.add(p);
            }
        }
        return productList;
    }

    // Getting product with particular text
    public List<Product> getProductByText(String text) {
        List<Product> productList = new ArrayList<>();
        for(Product p: products){
            if(p.getName().contains(text) || p.getType().contains(text) || p.getPlace().contains(text)){
                productList.add(p);
            }
        }
        return productList;
    }
}
