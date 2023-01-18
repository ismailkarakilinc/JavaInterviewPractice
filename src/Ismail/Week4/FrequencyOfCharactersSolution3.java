package Ismail.Week4;

import java.util.Arrays;

public class FrequencyOfCharactersSolution3 {

    public static void main(String[] args) {

        String str = "AAAAABCBBCCCDDEEEE";
        int lenght = str.length();
        char[] chars = str.toCharArray();

        //System.out.println(Arrays.toString(chars));
        for (int i = 0; i < lenght; i++) {
            int count = 1;
            for (int j = i + 1; j < lenght; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    chars[j] = ' '; // A        B C     C C C D D E E E E
                }
            }
            if (chars[i] != ' ') {
                System.out.print(chars[i] + "" + count);
            }
        }
    }
}
