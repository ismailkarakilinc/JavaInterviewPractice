package Ismail.Week5;

import java.util.ArrayList;
import java.util.List;

public class UniqueElements {

    public static void main(String[] args) {

        System.out.println(unique("AAABBBCDAAEENGGYT"));

    }

    public static String unique(String str) {

        ArrayList<String> list = new ArrayList<>();

        list.addAll(List.of(str.split("")));

        String result = "";

        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }
            if (count == 1) {
                result += list.get(i);
            }

        }
        return result;
    }
}

