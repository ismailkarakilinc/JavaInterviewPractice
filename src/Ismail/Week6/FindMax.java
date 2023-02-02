package Ismail.Week6;

public class FindMax {

    public static void main(String[] args) {

        int[] arr = {3,6,4,6,23,8};

        System.out.println(findMax(arr));
    }
    public static int findMax(int[] num){

        int max = num[0];

        for (int i = 1; i < num.length; i++){
            if (num[i] > max){
                max = num[i];
            }
        }
        return max;
    }
}
