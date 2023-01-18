package Ismail.Week4;

import java.util.*;

public class FrequencyOfCharactersSolution2 {

    public static void main(String[] args) {
        String str = "AAAAABBBBCCCDDEEEE";
        int[] charFrequency = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charFrequency[c]++;
            //System.out.println(Arrays.toString(charFrequency));
        }

        for (int i = 0; i < charFrequency.length; i++) {
            if (charFrequency[i] > 0) {
                System.out.print((char)i + "" + charFrequency[i]);
            }
        }
    }
}

