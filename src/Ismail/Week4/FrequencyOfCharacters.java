package Ismail.Week4;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        System.out.println(frequency("AAAABBBCDEECDD"));

    }
    public static String frequency(String freq) {
        ArrayList<String> str = new ArrayList<>(List.of(freq.split("")));
        String result = "";
        Set<String> set = new HashSet<>(str);
        for (String each : set) {
            result += "" + Collections.frequency(str, each) + each;
        }
        return result;
    }
}
