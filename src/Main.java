import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- WELCOME TO PRODUCT MANAGEMENT APPLICATION ---");

        ProductService productService = new ProductService();

        // Hey service, add the products...
        productService.addProduct(new Product("Asus Rog","Laptop","Desk1",2028));
        productService.addProduct(new Product("Samsung M31","SmartPhone","Desk1",2026));
        productService.addProduct(new Product("RealMe","EarPhone","Desk2",2024));
        productService.addProduct(new Product("Zebronics","KeyBoard","Desk3",2025));
        productService.addProduct(new Product("Zebronics","Mouse","Desk3",2025));

        // Getting all products
        List<Product> products = productService.getAllProduct();

        // Using enhance for loop to print all product
        for(Product p : products){
            System.out.println(p);
        }

        // Getting product with particular name
        Product particularProduct = productService.getProduct("Samsung M31");
        System.out.println(particularProduct);
    }
}