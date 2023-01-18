package Ismail.Week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SameLetters {

    public static void main(String[] args) {


        System.out.println(isSameLetter("asdfaaccs","fdsacasac"));


    }

    public static boolean isSameLetter(String str1, String str2){

        boolean result ;

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list1.addAll(List.of(str1.split("")));
        list2.addAll(List.of(str2.split("")));

        Collections.sort(list1);
        Collections.sort(list2);

        if (list1.equals(list2)){
            result = true;
        }else {
            result = false;
        }

        return result;
    }
}

