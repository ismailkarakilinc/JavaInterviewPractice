package Iuliia;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 10,
                b = 15,
                c = 20;
        int midNum = 0;

        if(a > b && a < c || a < b && a > c){
            midNum = a;
        }
        if(b > a && b < c || b < a && b > c){
            midNum = b;
        }
        if(c > a && c < b || c < a && c > b){
            midNum = c;
        }
        System.out.println(midNum + " is the median number");



    }
}


