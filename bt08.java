package btsession03;

import java.util.Locale;
import java.util.Scanner;

public class bt08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello world";
        str = str.toLowerCase();
        System.out.println("Nhập vào ký tự cần kiểm tra");
        char c = sc.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) count++;
        }
        System.out.println("Ký tự " + c + " xuất hiện " + count + " lần");
    }
}
