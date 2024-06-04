package btsession03.thuchanh01;

import java.util.Scanner;

public class thuchanh01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều rông");
        double width = sc.nextDouble();
        System.out.println("Nhập chiều dài");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Info: "+rectangle.display());
        System.out.println("Area: "+rectangle.getArea());
        System.out.println("Perimeter: "+rectangle.getPerimeter());
    }
}
