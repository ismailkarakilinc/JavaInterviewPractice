package Ismail.Additional;

public class Palindrome {

    public static void main(String[] args) {

        String[] list = {"Ismail", "Iuliia", "asa", "Level", "Ana"};

        int count = 0;

        for (int i = 0; i < list.length; i++) {
            String n = "";
            for (int j = list[i].length()-1; j >=0 ; j--) {
                n+=list[i].charAt(j);
            }
            if (n.equalsIgnoreCase(list[i])){
                count++;
            }
        }
        System.out.println(count);

    }
}
