package Iuliia;

public class SumOfTarget {
    public static int [] sumOfTarget(int [] arr, int target){

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (current + arr[j] == target){
                    return new int [] {current, arr[j]};
                }
            }
        }
        return null;
    }
}
