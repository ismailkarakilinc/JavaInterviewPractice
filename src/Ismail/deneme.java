package Ismail;

import java.util.Arrays;

public class deneme {

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5, 6, 7};
        int count = 0;
        for (int each : num) {
            if (each%2==0){
                count++;
            }
        }
        int index = 0;
        int[] result = new int[count];
        for (int i : num){
            if (i%2==0){
                result[index++]=i;
            }
        }
        System.out.println(Arrays.toString(result));

        }
    }