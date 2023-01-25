package Alex.Task04;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        System.out.println(frequency("AABCCDD"));

    }
    public static String frequency(String freq) {
        ArrayList<String> arr = new ArrayList<>(List.of(freq.split("")));
        String result = "";
        Set<String> set = new HashSet<>(arr);
        for (String each : set) {
            result += "" + Collections.frequency(arr, each) + each;
        }
        return result;
    }
/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
*/

}
