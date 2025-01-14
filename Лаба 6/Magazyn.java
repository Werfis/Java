import java.util.Arrays;

class Magazyn {
    private int numberOfCashRegisters;
    private Product[] products;
    private int numberOfSellers;

    public Magazyn(int numberOfCashRegisters, Product[] products, int numberOfSellers) {
        this.numberOfCashRegisters = numberOfCashRegisters;
        this.products = products;
        this.numberOfSellers = numberOfSellers;
    }

    public Magazyn() {
        this(1, new Product[0], 1);
    }

    public void setNumberOfCashRegisters(int numberOfCashRegisters) {
        this.numberOfCashRegisters = numberOfCashRegisters;
    }

    public void setNumberOfSellers(int numberOfSellers) {
        this.numberOfSellers = numberOfSellers;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public double calculateEfficiency() {
        return getAverageWeight() / calculateCashRegisterEfficiency();
    }

    private double calculateCashRegisterEfficiency() {
        return (double) numberOfSellers / numberOfCashRegisters;
    }

    private double getAverageWeight() {
        if (products.length == 0) {
            return 0;
        }
        double totalWeight = 0;
        for (Product product : products) {
            totalWeight += product.getWeight();
        }
        return totalWeight / products.length;
    }

    @Override
    public String toString() {
        return "Magazyn{" +
                "numberOfCashRegisters=" + numberOfCashRegisters +
                ", numberOfSellers=" + numberOfSellers +
                ", products=" + Arrays.toString(products) +
                ", efficiency=" + calculateEfficiency() +
                '}';
    }

    public static class Product {
        private double weight;
        private double price;

        public Product(double weight, double price) {
            this.weight = weight;
            this.price = price;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "weight=" + weight +
                    ", price=" + price +
                    '}';
        }
    }
}