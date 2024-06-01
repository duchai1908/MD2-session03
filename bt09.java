package btsession03;

import java.util.Arrays;
import java.util.Scanner;

public class bt09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng");
        int numberArrays = sc.nextInt();
        int[] arrays = new int[numberArrays];
        for(int i =0; i<arrays.length; i++){
            System.out.println("Nhập giá trị thứ "+ (i+1));
            arrays[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arrays));
        // cách 1
//        int max = arrays[0];
//        int max2;
//        for(int i =1; i< arrays.length; i++){
//            if(max < arrays[i]) max = arrays[i];
//        }
//        if(max == arrays[0]){
//            max2 = arrays[1];
//        }else{
//            max2 = arrays[0];
//        }
//        for(int i = 0; i< arrays.length ;i++){
//            if(arrays[i] == max){
//                continue;
//            }
//            if(max2 < arrays[i]) max2 = arrays[i];
//        }
//        System.out.println("số lớn nhất là: "+max);
//        System.out.println("số lớn thứ 2 là: "+max2);
        // cách 2
//        int max = arrays[0], max2 = arrays[0];
//        for(int i = 0; i < arrays.length;i++){
//            if(max<arrays[i]){
//                max2 = max;
//                max = arrays[i];
//            }else if(max2 < arrays[i] && arrays[i] != max){
//                max2 = arrays[i];
//            }
//        }
//        System.out.println("số lớn thứ 2: "+max2);

    }
}
