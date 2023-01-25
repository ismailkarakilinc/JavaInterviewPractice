package Alex.Task05;

public class ReverseString {
    public static void main(String[] args) {

        System.out.println(rStr("ABCD"));

    }


    public static String rStr(String str){

        String answer = "";

        for (int i = str.length()-1; i >= 0  ; i--) {
            answer += str.charAt(i);
        }

        return answer;

    }



    /*String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA*/

}
