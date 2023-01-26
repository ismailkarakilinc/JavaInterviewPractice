package Fatih.week5;

public class Task2 {
    //Write a return method that can reverse String
    //Ex: Reverse("ABCD"); ==> DCBA

    public static void reverse(String text){

        String reverse ="";
        for (int i = text.length()-1 ; i >=0 ; i--) {
            reverse+=text.charAt(i);
        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        Task2.reverse("ABCD");
    }
}
