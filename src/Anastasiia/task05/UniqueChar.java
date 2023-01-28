package Anastasiia.task05;

import java.util.*;

public class UniqueChar {

    public static void main(String[] args) {

        String a = "AAAvDDrEEwwSpOO1@@@";
        System.out.println(findUniqueChar(a));
    }

    public static String findUniqueChar(String str){

        String res = "";

        ArrayList<String> arr = new ArrayList<>(Arrays.asList(str.split("")));
        Set<String> set = new LinkedHashSet<>(arr);

        for (String each : set) {

            if(Collections.frequency(arr,each) == 1){
                res += each;
            }
        }

        return res;
    }

}
