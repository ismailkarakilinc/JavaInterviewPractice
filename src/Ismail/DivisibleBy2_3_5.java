package Ismail;

public class DivisibleBy2_3_5 {

    public static void main(String[] args) {

        int N = 30;
        String divisibleBy2 = "Codility";
        String divisibleBy3 = "Test";
        String divisibleBy5 = "Coders";

        for (int i = 1; i <= N ; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0){
                System.out.println(divisibleBy2+divisibleBy3+divisibleBy5);
            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(divisibleBy2+divisibleBy3);
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println(divisibleBy2+divisibleBy5);
            } else if (i % 3 == 0 && i % 5 == 0 ) {
                System.out.println(divisibleBy3+divisibleBy5);
            } else if ( i % 2 == 0) {
                System.out.println(divisibleBy2);
            } else if (i % 3 == 0 ) {
                System.out.println(divisibleBy3);
            } else if (i % 5 == 0 ) {
                System.out.println(divisibleBy5);
            } else {
                System.out.println(i);
            }

        }
    }
}
