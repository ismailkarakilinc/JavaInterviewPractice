package Ismail.Additional;

public class IsaninYontem {

    public static void main(String[] args) {

        System.out.println(removeX("xcvxxvdbX"));

    }

    public static String removeX(String str){

        for (int i = 1; i < str.length()-1; i++) {
            if (str.charAt(i) == 'x' || str.charAt(i) == 'X') {
                str = str.replace(""+str.charAt(i),"");
            }
        }
        return str;

    }
}
