package Anastasiia.task02;

public class SwapNumbers {

    public static void main(String[] args) {

        int x = 5,
                y = 10;

        x = x + y; // 5 + 10 = 15
        y = x - y; //15 - 10 = 5
        x = x - y; // 15 - 5 = 10;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
