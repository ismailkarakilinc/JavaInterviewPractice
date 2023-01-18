package Alex.Task04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SameLetters {

    public static void main(String[] args) {

        same("abcd", "cba");

    }

    public static void same(String str1, String str2) {

       /* ArrayList<String> arr1 = new ArrayList<>(Arrays.asList(str1));
        ArrayList<String> arr2 = new ArrayList<>(Arrays.asList(str2));
        arr1.addAll(List.of(str1.split("")));
        arr2.addAll(List.of(str2.split("")));
        Collections.sort(arr1);
        Collections.sort(arr2);
        if(arr1.equals(arr2)){
      *//*  String str3 = "" + arr1;
        String str4 = "" + arr2;*//*
        System.out.println(arr1 + " " + arr2);}
else {
            System.out.println(arr1 + " " + arr2);
        }*/

        List<String> list1 = new ArrayList<>(Arrays.asList(str1.split("")));
        Collections.sort(list1);
        List<String> sortedList1 = new ArrayList<>(list1);

        List<String> list2 = new ArrayList<>(Arrays.asList(str2.split("")));
        Collections.sort(list2);
        List<String> sortedList2 = new ArrayList<>(list2);

        if(sortedList1.equals(sortedList2)){
            System.out.println("both String's have the same letters :" + sortedList1 + " " + sortedList2 );
        }else{
            System.out.println("letters in both words are different: " + sortedList1 + " " + sortedList2 );
        }
    }

/*String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:*/



}