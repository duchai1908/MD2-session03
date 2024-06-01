package btsession03;

import java.util.Scanner;

public class bt05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử");
        int numberArray = sc.nextInt();
        int[] arrays = new int[numberArray];
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Nhập phần tử thứ "+ (i+1));
            arrays[i] = sc.nextInt();
        }
        int min = arrays[0];
        for(int element: arrays){
            if(min > element) min=element;
        }
        System.out.println("Giá trị nhỏ nhất là: "+min);
    }
}
