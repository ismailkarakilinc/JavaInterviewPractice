package alican.task01;

public class OddOrEven {
    //Write a method identifies num is odd or even
    public static void main(String[] args) {
        System.out.println(oddOrEven(11));
    }

    public static String oddOrEven(int n){
        return n % 2 == 0 ? "Even" : "Odd";
    }


}
