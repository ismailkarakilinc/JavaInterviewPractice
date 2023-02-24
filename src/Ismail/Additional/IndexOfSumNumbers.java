package Ismail.Additional;

import java.util.Arrays;

public class IndexOfSumNumbers {

    public static void main(String[] args) {

        int[] arr = {1,2,100,7,11,8,15,99};
        String nums = String.valueOf(Arrays.toString(arr));

        System.out.println(nums);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {

            if (arr[i]+arr[j] == 9){
                System.out.println("["+i+","+j+"]");
            }

        }
    }
}
}
