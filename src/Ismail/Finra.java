package Ismail;

public class Finra {
    public static void main(String[] args) {



    int number = 15;
    String result = "";

        if (number < 1 || number > 30) {
        System.err.println("The number should be between 1 to 30 !!!");
    } else if (number % 3 == 0 && number % 5 == 0) {
        result="FINRA";
    }else if (number % 3 == 0) {
        result = "FIN";
    } else if (number % 5 == 0){
        result = "RA";
    }else {
        result = "NUMBER: " + number;
    }
        System.out.println(result);
}
}


