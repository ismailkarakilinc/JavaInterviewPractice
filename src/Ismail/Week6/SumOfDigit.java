package Ismail.Week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfDigit {

    public static void main(String[] args) {

        System.out.println(sum("ismas8as123d3as"));

    }
    public static int sum(String str){

        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                result += Integer.valueOf(""+str.charAt(i));
        }

            }
        return result;
        }
}

