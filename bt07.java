package btsession03;

import java.util.Scanner;

public class bt07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng và cột");
        int rows = sc.nextInt();
        int[][] matrix = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.println("Nhập giá trị cho dòng " + (i + 1) + " và cột " + (j + 1));
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[i][j] + "\t\t");
            }
            System.out.println("\n");
        }
       int sum1 =0;
        for(int i = 0; i < rows;i++){
            for(int j = 0; j<rows; j++){
                if(i == j){
                    sum1 += matrix[i][j];
                }
            }
        }
        System.out.println("Đường chéo chính có tổng là: "+sum1);

        int sum2 = 0;
        for(int i = 0; i < rows;i++){
            for(int j = 0; j<rows; j++){
                if(j == matrix.length - 1 - i){
                    sum2 += matrix[i][j];
                }
            }
        }
        System.out.println(sum2);
        System.out.println("Đường chéo phụ có tổng là: "+sum2);
    }
}
