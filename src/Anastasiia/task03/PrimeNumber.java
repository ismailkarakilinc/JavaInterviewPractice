package Anastasiia.task03;

public class PrimeNumber {

    public static void main(String[] args) {

        int num = 77;
        int num1 = 3;

        System.out.println(isPrime(num));
        System.out.println(isPrime(num1));

    }

    public static boolean isPrime(int a) {

        if(a<=1){
            return false;
        }

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
