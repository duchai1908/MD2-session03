package btsession03;

import java.util.Arrays;
import java.util.Scanner;

public class bt04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng");
        int rows = sc.nextInt();
        System.out.println("Nhập số cột");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        for(int i =0; i<rows;i++){
            for(int j = 0; j< columns;j++){
                System.out.println("Nhập giá trị cho dòng "+ (i+1) + " và cột " +(j+1) );
                int numberAdd = sc.nextInt();
                matrix[i][j] = numberAdd;
            }
        }
        System.out.println("Ma trận vừa nhập");
        for(int i =0; i<rows;i++){
            for(int j = 0; j< columns;j++){
                System.out.print(matrix[i][j] + "\t\t");
            }
            System.out.println("\n");
        }
        int max = matrix[0][0];
        for(int i =0; i<rows;i++){
            for(int j = 0; j< columns;j++){
                if(max<matrix[i][j]) max = matrix[i][j];
            }
        }
        System.out.println("Giá trị lớn nhất là: "+max);


    }
}
