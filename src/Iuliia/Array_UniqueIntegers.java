package Iuliia;

import java.util.Arrays;

public class Array_UniqueIntegers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOfZero(27)));
    }

    public static int[] sumOfZero(int N) {
        int[] arr = new int[N];

        for (int i = 0; i < arr.length/2; i++) {
            arr[i] = i+1;
        }
        for (int i = arr.length/2, j = 1; i < arr.length; i++, j++) {
            arr[i] = -j;
        }
        if (N % 2 != 0) {
            arr[N-1] = 0;
        }

        return arr;
    }


}

/*
Array - N unique integers that sum up to 0
Write a function that given an integer N (1 < N < 100), returns an array
containing N unique integers that sum up to 0. The function can return any
such array.
*/