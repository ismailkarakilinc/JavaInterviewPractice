package Ismail;

public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println(checkPrime(9));

    }

    public static boolean checkPrime(int num){

        for (int i = 2; i < num ; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
