package Anastasiia.task04;

public class RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println(removeDuplicates("AAABBBCCC"));

    }

    public static String removeDuplicates(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if(!result.contains(""+str.charAt(i))){
                result += ""+str.charAt(i);
            }

        }

        return result;
    }
}
