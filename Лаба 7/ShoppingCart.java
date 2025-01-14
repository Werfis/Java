import java.util.ArrayList;
import java.util.Random;

class ShoppingCart {
    private ArrayList<Product> products;
    private String favoriteProductName;

    public ShoppingCart(String favoriteProductName) {
        this.products = new ArrayList<>();
        this.favoriteProductName = favoriteProductName;
    }

    public void addProduct(Product product) {
        if (!products.contains(product)) {
            products.add(product);
        } else {
            System.out.println("Product " + product.getName() + " is already in the cart.");
        }
    }

    public void removeHeavyAndExpensiveProducts() {
        products.removeIf(product -> product.getWeight() > 5 || product.getPrice() > 10000);
    }

    public void setFavoriteProductToFirst() {
        Product favoriteProduct = null;
        for (Product product : products) {
            if (product.getName().equals(favoriteProductName)) {
                favoriteProduct = product;
                break;
            }
        }
        if (favoriteProduct != null) {
            products.remove(favoriteProduct);
            products.add(0, favoriteProduct);
        }
    }

    public void printAffordableHeavyProducts() {
        System.out.println("Products with price < 10 and weight > 2:");
        for (Product product : products) {
            if (product.getPrice() < 10 && product.getWeight() > 2) {
                System.out.println(product);
            }
        }
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "products=" + products +
                '}';
    }
}