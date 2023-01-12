package Ismail;

public class PrintConsecutiveNumbers {

    public static void main(String[] args) {

        int N = 41;

        String divisible2 = "Codility";
        String divisible3 = "Test";
        String divisible5 = "Coders";

        for (int i = 1; i <= N; i++) {

            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0){
                System.out.println(divisible2 + divisible3 + divisible5);
            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(divisible2 + divisible3);
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println(divisible2 + divisible5);
            } else if (i % 3 == 0 && i % 5 == 0){
                System.out.println(divisible3 + divisible5);
            } else if (i % 2 == 0 ) {
                System.out.println(divisible2);
            } else if (i % 3 == 0 ) {
                System.out.println(divisible3);
            } else if (i % 5 == 0 ) {
                System.out.println(divisible5);
            } else {
                System.out.println(i);
            }
        }
    }
}
