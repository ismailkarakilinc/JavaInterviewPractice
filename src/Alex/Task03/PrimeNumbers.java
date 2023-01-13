package Alex.Task03;

public class PrimeNumbers {

    public static void main(String[] args) {

        int prime = 6;

        System.out.println("is number " + prime + " is prime? - " + isPrime(prime));

    }

    public static boolean isPrime(int num) {
        if(num <= 1){
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
}




