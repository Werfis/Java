public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart("APPLE");

        Random random = new Random();
        String[] productNames = ProductName.values();

        for (int i = 0; i < 20; i++) {
            String name = productNames[random.nextInt(productNames.length)].name();
            double weight = random.nextDouble() * 10;
            double price = random.nextDouble() * 20000;
            cart.addProduct(new Product(name, weight, price));
        }

        cart.removeHeavyAndExpensiveProducts();

        cart.setFavoriteProductToFirst();

        cart.printAffordableHeavyProducts();

        System.out.println(cart);
    }