package Ismail.Week5;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println(reverse("Ismail"));
    }

    public static String reverse(String str){
        ArrayList <String> list = new ArrayList<>();

        list.addAll(List.of(str.split("")));

        String result = "";

        for (int i = list.size()-1; i >=0 ; i--) {
            result += list.get(i);
        }
        return result;
    }
}
