package btsession03.thuchanh04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a");
        double a = sc.nextDouble();
        System.out.println("Nhập số b");
        double b = sc.nextDouble();
        Calculator calculator = new Calculator(a, b);
        System.out.println("Phép cộng: "+calculator.sum());
        System.out.println("Phép trừ: "+calculator.sub());
        System.out.println("Phép nhân: "+calculator.multiply());
        System.out.println("Phép chia: "+calculator.div());
        System.out.println("Nhập tiếp số a");
        a = sc.nextDouble();
        System.out.println("Nhập tiếp số b");
        b = sc.nextDouble();
        calculator.setA(a);
        calculator.setB(b);
        System.out.println("Phép cộng: "+calculator.sum());
        System.out.println("Phép trừ: "+calculator.sub());
        System.out.println("Phép nhân: "+calculator.multiply());
        System.out.println("Phép chia: "+calculator.div());


    }
}
