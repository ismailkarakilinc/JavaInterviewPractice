package Ismail.Week4;

import java.util.*;

public class RemoveDublicate {

    public static void main(String[] args) {

        System.out.println(removeDublicate("AAAACCCCXZZDEAAABVBB"));

    }

    public static String removeDublicate (String str1){

        String result = "";

        Set<String> list = new TreeSet<>(); // A C X Z D E B V

        list.addAll(List.of(str1.split("")));

        System.out.println(list);

        for (String each : list) {

            result += each;

        }

        return result;
    }
}
