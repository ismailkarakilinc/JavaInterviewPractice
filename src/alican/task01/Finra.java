package alican.task01;

public class Finra {
    /*
    Write a function which prints out the numbers from 1 to 30 but
    for numbers which are a multiple of 3, print "FIN" instead of the number
    and for numbers which are a multiple of 5, print "RA" instead of the number.
    for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */
    public static void main(String[] args) {
        Finra();
    }
    public static void Finra(){
        String str="";
        for (int i = 1; i <=30; i++) {
            if(i%5==0 && i%3==0){
                str+="FINRA ";
            }else if (i%5==0) {
                str+="RA ";
            }else if (i%3==0) {
                str+="FIN ";
            }else {
                str+=i+" ";
            }

        }
        System.out.println(str);
    }

}
