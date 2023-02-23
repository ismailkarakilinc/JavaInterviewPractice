package Ismail.Week8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class N_unique_integers_that_sum_up_to_0 {

    public static void main(String[] args) {

        int n = 3;

        int[] result = new int[n];
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            result[i] = i + 1;
            sum += result[i];
        }
        result[n - 1] = -sum;
        System.out.println(Arrays.toString(result));
    }
}
