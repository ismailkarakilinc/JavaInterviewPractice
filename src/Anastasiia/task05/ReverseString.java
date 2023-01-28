package Anastasiia.task05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseString {
    public static void main(String[] args) {

        String a = "Automation is cool";
        System.out.println(reverse(a));
        System.out.println(reverseNoLoop(a));
        System.out.println(reverseNoLooop(a));

    }

    public static String reverse(String str){

        String reverse = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse += ""+str.charAt(i);
        }

        return reverse;

    }

    public static String reverseNoLoop(String str){

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        Collections.reverse(list);
        String reverse = String.join("",list);
        return  reverse;
    }

    public static String reverseNoLooop(String str){
        String reverse = new StringBuilder(str).reverse().toString();
        return reverse;

    }

}
