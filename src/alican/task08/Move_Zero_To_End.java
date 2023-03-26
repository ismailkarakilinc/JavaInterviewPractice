package alican.task08;

import java.util.Arrays;

public class Move_Zero_To_End {
    public static int[] moveZerosToTheEnd(int[] array) {

        int[] result = new int[array.length];
        int count = 0;

        for (int each : array) {
            if (each != 0)
                result[count++] = each;
        }

        return result;

    }

    public static void main(String[] args) {
        int array[]= {1,0,2,0,3,0,4,0};
        moveZerosToTheEnd(array);
        System.out.println(Arrays.toString(array));



    }

}
