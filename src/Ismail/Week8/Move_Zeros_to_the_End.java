package Ismail.Week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Move_Zeros_to_the_End {

    public static void main(String[] args) {

        int[] arr = {1, 2, 0, 3, 0, 0, 5};

        int zeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[zeroIndex];
                arr[zeroIndex] = temp;
                zeroIndex++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
