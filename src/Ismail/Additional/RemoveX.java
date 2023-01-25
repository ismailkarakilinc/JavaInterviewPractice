package Ismail.Additional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveX {

    public static void main(String[] args) {

        System.out.println(stringX("bvxxbbfdx"));


            }
    public static String stringX(String str) {

        String result = "";
        String result1;

        for (int i = 1; i < str.length()-1; i++) {

            if (!(str.charAt(i) == 'x' || str.charAt(i) == 'X')){
                result += str.charAt(i);
            }
        }
        result1 = str.substring(0,1)+result+str.substring(str.length()-1);

        return result1;

    }
}



/*
 String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(i > 0 && i < (str.length() - 1) && str.charAt(i) == 'x')) {
                result += str.charAt(i);
            }
        }
        return result;
 */


