package Anastasiia.task01;

public class DivideWithoutDivisionOperator {

    public static void main(String[] args) {

        int num = 75;
        int num2 =9;
        int res = 0;

        while(num>=num2){
            num -= num2;
            res++;
        }

        System.out.println(res);
    }
}
