package Alex.Task04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SameLetters {

    public static void main(String[] args) {

        same("abc", "cba");

    }

    public static void same(String str1, String str2) {

        List<String> list1 = new ArrayList<>(Arrays.asList(str1.split("")));
        Collections.sort(list1);

        List<String> list2 = new ArrayList<>(Arrays.asList(str2.split("")));
        Collections.sort(list2);

        if(list1.equals(list2)){
            System.out.println("both String's have the same letters :" + list1 + " " + list2 );
        }else{
            System.out.println("letters in both words are different: " + list1 + " " + list2 );
        }
    }

/*String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:*/



}