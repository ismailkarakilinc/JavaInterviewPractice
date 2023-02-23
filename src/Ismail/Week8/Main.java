package Ismail.Week8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        int n = 3;
        int[] arr = uniqueIntegersSumToZero(n);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] uniqueIntegersSumToZero(int n) {

        if (n<2 || n>99){
            System.err.println("Given an integer N should between (1 < N < 100)");
            System.exit(1);
        }
        int[] arr = new int[n];

        int sum = 0;

        for (int i = 0; i < n - 1; i++) {
            int randNum = (int) (Math.random() * 100);  //explicit casting
            if (Math.random() > 0.5) {   //0.3*100 = -30 + 60
                randNum *= 1;
            } else {
                randNum *= -1;
            }
            arr[i] = randNum;
            sum += randNum;
        }
        arr[n - 1] = -sum;
        return arr;
    }
}
