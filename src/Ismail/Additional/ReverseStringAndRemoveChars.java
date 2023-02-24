package Ismail.Additional;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStringAndRemoveChars {

    public static void main(String[] args) {

        String str = "asmf+=kro34@1as";

        String result ="";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))||Character.isLetter(str.charAt(i))) {
            result += "" + str.charAt(i);
        }

    }
        String result2 = "";
        ArrayList<String> list = new ArrayList<>();
        list.addAll(List.of(result.split("")));

        for (int i = list.size()-1 ; i >=0 ; i--) {
            result2 += list.get(i);
        }
        System.out.println(result2);
}
}
