package alican.task07;

import java.util.Arrays;

public class Sort_Ascending_Without_SortMethod {

    public static int[] sortingArrayAsc(int[] arr) {

        int[] result = Arrays.copyOfRange(arr, 0, arr.length);

        for (int i = 0; i < result.length; i++) {

            for (int j = 0; j < result.length; j++) {
                if (result[i] < result[j]) {
                    Integer temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }

        }

        return result;

    }

    public static void main(String[] args) {
        int [] arr={10,90,70,60,100};
        System.out.println(Arrays.toString(sortingArrayAsc(arr)));
    }

}
