package Alex.Task02;

public class DivisibleBy3_5_15 {

    public static void main(String[] args) {

        String by15 = "Divisible by 15:",
                by3 = "Divisible by 3:",
                by5 = "Divisible by 5:";

        for (int i = 1; i < 101 ; i++) {
            if(i%15 == 0){
                by15 += " " + i;
            }else if(i%5 == 0) {
                by5 += " " + i;
            }else if(i%3 == 0){
                by3 += " " + i;
            }else{
                continue;
            }
        }

        System.out.println(by15);
        System.out.println(by5);
        System.out.println(by3);
    }
}
