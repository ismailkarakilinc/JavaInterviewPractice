package alican.task07;

import java.util.Arrays;

public class Array_FindMin {
    public static int minValue(int[] n){
        Arrays.sort(n);
        return n[0];
    }

    public static int min(int[] n){
        int min=Integer.MAX_VALUE;
        for (int each : n) {
            if(each<min){
                min=each;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr={-18,0,56,88,99,1919};
        System.out.println(minValue(arr)+" with Sort Method");
        System.out.println(min(arr)+" without Sort Method");
    }
}
