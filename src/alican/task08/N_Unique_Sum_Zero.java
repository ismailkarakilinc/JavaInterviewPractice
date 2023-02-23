package alican.task08;

import java.util.Arrays;

public class N_Unique_Sum_Zero {
    public static int[] uniqueIntegers(int N){
        int[] result =new int[N];
        int sum=0;
        for (int i = 0; i <N-1 ; i++) {
            result[i]=i;
            sum+=i;
        }
        result[N-1]=-sum;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(uniqueIntegers(4)));
    }
}
