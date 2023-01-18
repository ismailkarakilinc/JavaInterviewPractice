package Anastasiia.task03;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        System.out.println(reverseNegative(-64589));
        System.out.println(reverseNegative(456));

    }
    public static int reverseNegative(int a){

        if(a<0) {
            a = -a;
            String res = "" + a;
            String reverseRes = "";

            for (int i = res.length() - 1; i >= 0; i--) {
                reverseRes += res.charAt(i);
            }
            return -1 * Integer.parseInt(reverseRes);
        }else{
            System.out.print("Number is positive or zero: ");
        }
        return a;
    }

}
