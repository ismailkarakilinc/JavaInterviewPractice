package Fatih.week5;

public class Task1 {

    //Write a return method that can find the unique characters from the String
    //Ex: unique("AAABBBCCCDEF") ==> "DEF";

    public static void unique(String text) {
        String onlyUnique = "";

        for (int i = 0; i < text.length(); i++) {
            int count = 0;
            for (int j = 0; j < text.length(); j++) {


                if (text.charAt(i) == text.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(text.charAt(i));
            }
        }


    }

    public static void main(String[] args) {

        Task1.unique("AAABBBCCCDEF");
    }

}
