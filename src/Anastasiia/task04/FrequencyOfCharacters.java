package Anastasiia.task04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        System.out.println(frequencyOfCharacters("AAABBCCCDD"));

    }

    public static String frequencyOfCharacters(String str) {

        String freq = "";
        String res = "";

        for (int i = 0; i < str.length(); i++) {

            if (!freq.contains("" + str.charAt(i))) {
                freq += "" + str.charAt(i);
            }

        }

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        for (int i = 0; i < freq.length() ; i++) {

            res += "" + freq.charAt(i) + Collections.frequency(list, ""+freq.charAt(i));

        }

        return res;
    }

}

