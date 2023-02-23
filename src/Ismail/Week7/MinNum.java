package Ismail.Week7;

import java.util.Arrays;

public class MinNum {

    public static void main(String[] args) {


        int[] num = {1,-4,7,2,1,4,66,-1};

        int result = num[0];
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (result>num[j]){
                    result = num[j];
                }
            }

        }
        System.out.println(result);
    }
}
