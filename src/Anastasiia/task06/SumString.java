package Anastasiia.task06;

public class SumString {

    public static void main(String[] args) {
        String sum = "089674";
        System.out.println("sumOfDigitsInString(sum) = " + sumOfDigitsInString(sum));
    }

    public static int sumOfDigitsInString(String str){

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                sum +=ch-'0';
            }
        }

        return sum;
    }
}
//String -- sum of digits in a string
//Write a method that can return the sum of the digits in a string