package Ismail.Week7;

import java.util.Arrays;

public class DescendingArray {


    public static void main(String[] args) {

        int[] arr = {0, 9, 8, 7};

        for (int i = 0; i < arr.length; i++) {
            for (int j= i+1; j < arr.length; j++) {
                if (arr[i]<arr[j]){
                    int reminder = arr[i];
                    arr[i] = arr[j];
                    arr[j] = reminder;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
