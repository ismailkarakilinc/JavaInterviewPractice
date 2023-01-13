package Alex.Task03;

public class reverseNegativeNumber {
    public static void main(String[] args) {

        System.out.println(reverse(-1234.12));

    }

    public static double reverse(double num) {

        double reversed = 0;

        while (num != 0) {
            double digit = num % 10; // -1234/10=-123.4 = 4
            reversed = reversed * 10 + digit; // 0 * 10 + 4 = 4
            num /= 10; // -1234 / 10 = -123.4 or rounded to 123 for integer, and cycle starts again
        }
        return reversed;
    }

}
