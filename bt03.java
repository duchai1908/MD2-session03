package btsession03;

import java.util.Arrays;
import java.util.Scanner;

public class bt03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[3];
        int[] array2 = new int[7];
        int[] array3 = new int[array1.length + array2.length];
        System.out.println("Nhận phần tử mảng 1");
        for(int i =0; i < array1.length;i++){
            System.out.println("Phần tử thứ " + (i+1));
            array1[i] = sc.nextInt();
        }
        System.out.println("Nhập phần tử mảng 2");
        for(int i =0; i < array2.length;i++){
            System.out.println("Phần tử thứ " + (i+1));
            array2[i] = sc.nextInt();
        }
        for(int i = 0; i< array1.length; i++){
            array3[i] = array1[i];
        }
        System.out.println(Arrays.toString(array3));
        for(int i = array2.length, j = 0;i<array3.length && j < array2.length;i++,j++){
            array3[i] = array2[j];
        }
        System.out.println(Arrays.toString(array3));
    }
}
