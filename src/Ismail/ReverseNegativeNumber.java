package Ismail;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        System.out.println(reverseNegative(-32679));

    }

    public static int reverseNegative(int num){

        int reversed = 0;
        while (num>=0){
            System.err.println("Number should be negative!!!");
            System.exit(1);
        }
        while (num < 0) {
            int digit = num % 10;//-32  digit = 2
            reversed = reversed * 10 + digit;  // 12
            num /= 10; // -32
        }
        return reversed;

    }
}

