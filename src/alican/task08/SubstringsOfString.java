package alican.task08;

public class SubstringsOfString {
    public static void main(String[] args) {
        //all substrings of abbc

        String str="abbc";

        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <=str.length() ; j++) {
                System.out.println(str.substring(i,j));
            }
        }





    }
}
