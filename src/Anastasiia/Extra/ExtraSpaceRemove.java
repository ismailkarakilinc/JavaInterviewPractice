package Anastasiia.Extra;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class ExtraSpaceRemove {

    public static void main(String[] args) {

        String str ="Automation    is   cool";
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(removeExtraSpace(str));
    }

    public static String removeExtraSpace(String sentence) {

        String[] words = sentence.trim().split(" ");
        String result = "";

        for (String each : words) {
            if (!each.isBlank()) {
                result += each + " ";
            }
        }

        return result.trim();

    }
}
