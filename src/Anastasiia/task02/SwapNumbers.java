package Anastasiia.task02;

public class SwapNumbers {

    public static void main(String[] args) {

        int x = 3,
                y = 8;

        y = x + y; // 3 + 8 = 11
        x = y - x; //11 - 3 = 8
        y = y - x; // 11 - 8 = 3;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
