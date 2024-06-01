package btsession03;

import java.util.Arrays;
import java.util.Scanner;

public class bt02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrays = new int[10];
        for(int i = 0; i< arrays.length;i++){
            arrays[i] = i;
        }
        System.out.println(Arrays.toString(arrays));
        System.out.println("Nhập số cần chèn");
        int addNumber = sc.nextInt();
        System.out.println("Nhập vị trí index cần chèn");
        int addIndex = sc.nextInt();
        if(addIndex <= -1 && addIndex >= arrays.length-1){
            System.out.println("Không chèn được vào phần tử mảng");
        }
        else {
            int[] newArrays = new int[arrays.length+1];
            for(int i = 0; i< arrays.length;i++){
                newArrays[i] = arrays[i];
            }
            System.out.println(Arrays.toString(newArrays));
            for(int i = newArrays.length-1; i>addIndex;i--){
                newArrays[i] = newArrays[i-1];
            }
            newArrays[addIndex] = addNumber;
            arrays = newArrays;
            System.out.println(Arrays.toString(arrays));
        }
    }
}
