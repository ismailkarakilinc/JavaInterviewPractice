package Anastasiia.task07;

import java.util.Arrays;

public class SortAscending {

    public static void main(String[] args) {

        int[] arr = {45,8,7,1,46,21,30,78,107,9,8,4};
        System.out.println(Arrays.toString(sortAscending(arr)));
    }

    public static int[] sortAscending(int[] arr){

        int[] result = Arrays.copyOfRange(arr,0, arr.length);
        int num = 0;

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if(result[i]< result[j]){
                    num = result[i];
                    result[i] = result[j];
                    result[j] = num;
                }
            }
        }

        return result;
    }
}
