package Ismail.Week6;

public class deneme1 {

    public static void main(String[] args) {



        String string1 = "Test Automation Engineer";
        String string2 = "Isa Yilmaz";

        for (int i = 0; i < string2.length(); i++) {
            String charToRemove = Character.toString(string2.charAt(i));
            string1 = string1.replace(charToRemove, "");
        }

        System.out.println(string1);
}}
