package btsession03.thuchanh03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã Category");
        int categoryId = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên Category");
        String categoryName = sc.nextLine();
        Category category = new Category(categoryName, categoryId);
        System.out.println("Thông tin category: " + category);
        System.out.println("Nhập mã product");
        int productId = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sản phẩm");
        String productName = sc.nextLine();
        System.out.println("Nhập giá sản phẩm");
        int productPrice = Integer.parseInt(sc.nextLine());
        Product product = new Product(productId, productName, productPrice, category);
        System.out.println(product);
    }
}
