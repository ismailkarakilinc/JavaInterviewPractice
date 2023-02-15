package Anastasiia.task07;

public class MinNumber {

    public static void main(String[] args) {

        int[] arr = {1,8,7,5,4,9,0,-1,96,-98,78,0,12,-54};
        System.out.println(minimumNumber(arr));

    }

    public static int minimumNumber(int[] arr){
        int min = arr[0];
        for (int each : arr) {
            if(each<min){
                min = each;
            }
        }
        return min;
    }
}
