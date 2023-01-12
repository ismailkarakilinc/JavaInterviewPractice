package Ismail;

public class SwapNumbers {

    public static void main(String[] args) {

        int a = 5;
        int b = 8;


        b = b - a;
        a = a + b;
        b = a - b;

        System.out.println("b = " + b);
        System.out.println("a = " + a);
    }
}
