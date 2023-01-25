package Ismail.Additional;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {

        int[] arr = new int[] { 5, 4, 3, 8, 32, 768, 564, 95, 172, 1500, 859, 754 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                int tmp = 0;            // 5,4,3,8,32,768,564....
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];    // 3,
                    arr[j] = tmp;       // 3,4
                }
            }
        }
        // After Sorting Printing The Value.............

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
