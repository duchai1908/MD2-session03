package btsession03;

import java.util.Arrays;
import java.util.Scanner;

public class bt01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử");
        int numberInArray = sc.nextInt();
        int[] array = new int[numberInArray];
        for(int i =0; i< numberInArray;i++){
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập số muốn xoá");
        int numberDelete = sc.nextInt();
        int indexDelete =0;
        for (int i = 0; i< array.length; i++){
            if(array[i] == numberDelete){
                indexDelete = i;
                break;
            }
        }
        System.out.println(indexDelete);
        for(int i = indexDelete; i<array.length;i++){
            if(i == array.length-1){
                array[i] = 0;
            }else {
                array[i] = array[i+1];
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
