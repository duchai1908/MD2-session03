package btsession03.thuchanh03;

public class Category {
    private String categoryName;
    private int categoryID;

    public Category() {
    }

    public Category(String categoryName, int categoryID) {
        this.categoryName = categoryName;
        this.categoryID = categoryID;
    }
    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                ", categoryID=" + categoryID +
                '}';
    }
}
