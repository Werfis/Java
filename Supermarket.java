class Supermarket extends Magazyn {
    private double area;
    private String[] productCategories;

    public Supermarket(int numberOfCashRegisters, Product[] products, int numberOfSellers, double area, String[] productCategories) {
        super(numberOfCashRegisters, products, numberOfSellers);
        this.area = area;
        this.productCategories = productCategories;
    }

    public Supermarket() {
        this(1, new Product[0], 1, 0, new String[0]);
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setProductCategories(String[] productCategories) {
        this.productCategories = productCategories;
    }

    @Override
    public double calculateEfficiency() {
        return (area / productCategories.length) * calculateCashRegisterEfficiency();
    }

    @Override
    public String toString() {
        return "Supermarket{" +
                "area=" + area +
                ", productCategories=" + Arrays.toString(productCategories) +
                ", " + super.toString() +
                '}';
    }
}