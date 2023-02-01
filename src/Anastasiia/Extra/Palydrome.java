package Anastasiia.Extra;

public class Palydrome {

    public static void main(String[] args) {

        String[] list = {"Anna", "Level", "Japan", "Canada", "madam", "Bullet"};

        int count = 0;
        for (String each : list) {

            String str ="";
            for (int i = each.length()-1; i >=0; i--) {
                str += each.charAt(i);

                if(str.equalsIgnoreCase(each)){
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}
