package Ismail.Week4;

public class RemoveDublicates2 {

    public static void main(String[] args) {

        System.out.println(remove("AAAVVVBCCCDCCZZE"));


    }

    public static String remove(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (!(result.contains(""+str.charAt(i)))){
                result+=""+str.charAt(i);
            }
        }
        return result;
    }
}
