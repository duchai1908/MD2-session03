package btsession03;

import java.util.Scanner;

public class bt06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng");
        int rows = sc.nextInt();
        System.out.println("Nhập số cột");
        int columns = sc.nextInt();
        float[][] arrays = new float[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Nhập giá trị cho dòng " + (i + 1) + " và cột " + (j + 1));
                arrays[i][j] = sc.nextFloat();
            }
        }
        System.out.println("Mảng vừa nhập");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arrays[i][j] + "\t\t");
            }
            System.out.println("\n");
        }
        System.out.println("Nhập vào số cột cần tính tổng");
        int sumColumns = sc.nextInt();
        float sum = 0;
        if (sumColumns > columns) {
            System.out.println("Vị trí cột cần tính tổng vượt quá số cột trong mảng");
        } else {
            int j = sumColumns - 1;
            for (int i = 0; i < rows; i++) {
                sum += arrays[i][j];
            }
        }
        System.out.println("Tổng của cột " + sumColumns + " là: " + sum);

    }
}
