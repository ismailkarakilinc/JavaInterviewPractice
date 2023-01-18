package Alex.Task04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SameLettersV2 {

    public static void main(String[] args) {

        same("abc", "cba");

    }

    public static void same(String str1, String str2) {


        ArrayList<String> arr1 = new ArrayList<>(Arrays.asList(str1.split("")));
        ArrayList<String> arr2 = new ArrayList<>(Arrays.asList(str2.split("")));

        String result = "";

        for (String each : arr1) {
            if (str1.length() == str2.length() && (arr2.containsAll(arr1))) {
            result = "much";
            }
            else{
                result = "no much";
            }
        }
        System.out.println("" + result);

    }
}
/*String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:*/



