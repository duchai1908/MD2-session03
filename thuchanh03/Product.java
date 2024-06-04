package btsession03.thuchanh03;

public class Product {
    private int productId;
    private String productName;
    private int productPrice;
    private Category category;

    public Product() {
    }

    public Product(int productId, String productName, int productPrice, Category category) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", category=" + category.getCategoryName() +
                '}';
    }
}
