package Anastasiia.task06;

public class ArrayFindMax {

    public static void main(String[] args) {

        int[] array = {15,75,8,15,102,14,111,587,30,456};
        System.out.println(findMax(array));
    }

    public static int findMax(int[] array){

       //int max = array[0];
        int max = Integer.MIN_VALUE;

        for (int each : array) {
            if(each>max){
                max = each;
            }
        }

        return max;
    }

    public static double findMax(double[] array){

       double max = array[0];

        for (double each : array) {
            if(each>max){
                max = each;
            }
        }

        return max;
    }



}
//Array -- Find Maximum
//Write a method that can find the maximum number from an int Array