package at.campus02.pr3.fileio.ue3.Uebung11;

public class Product {
    protected String productName;
    protected double price;
    protected String productCategory;

    public Product(String productName, double price, String productCategory) {
        this.productName = productName;
        this.price = price;
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product " + productName+" "  +
                 price +
                ", Category " + productCategory;
    }
}
