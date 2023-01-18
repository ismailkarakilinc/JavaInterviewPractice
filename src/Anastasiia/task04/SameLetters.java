package Anastasiia.task04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SameLetters {
    public static void main(String[] args) {

        System.out.println(isTheSameLetters("abc", "bca"));
        System.out.println(isTheSameLetters("aaa", "bbb"));

    }

    public static boolean isTheSameLetters(String str1, String str2){

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(str1.split("")));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(str2.split("")));
        Collections.sort(list1);
        Collections.sort(list2);

        if(list1.equals(list2)){
            return true;
        }

        return false;
    }
}
