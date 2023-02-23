package alican.task07;

import java.util.Arrays;

public class Array_FindMax {
    public static int maxValue(int[] n) {
        Arrays.sort(n);
        return n[n.length - 1];
    }

    public static int max(int[] n){
       int max=n[0];
        for (int each : n) {
            if(each>max){
                max=each;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-98, 0, 4, 66, 999, 1000};
        System.out.println(maxValue(arr)+" with sort method");
        System.out.println(max(arr)+" without sort method");
    }
}