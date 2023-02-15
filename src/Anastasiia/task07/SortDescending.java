package Anastasiia.task07;

import java.util.Arrays;

public class SortDescending {

    public static void main(String[] args) {

        int[] arr = {45,8,7,1,46,21,30,78,107,9,8,4};
        System.out.println(Arrays.toString(sortDescending(arr)));
    }

    public static int[] sortDescending(int[] arr){

        int[] res = Arrays.copyOfRange(arr,0, arr.length);
        int num = 0;

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                if(res[i]> res[j]){
                    num = res[i];
                    res[i] = res[j];
                    res[j] = num;
                }
            }
        }

        return res;
    }
}
