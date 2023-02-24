package Ismail.Week6;

import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your password");
        
        String password = input.next();
        
        boolean result = false;
        
        if (password.length()<6 || password.contains(" ")){
            result = false;
        }
        int digit = 0;
        int specialCharacter = 0;
        int upperCase = 0;
        int lowerCase = 0;

        for (Character c : password.toCharArray()) {
            if(Character.isDigit(c)){
                digit++;
            }
            if (!(Character.isLetter(c)||Character.isDigit(c))){
                specialCharacter++;
            }
            if (Character.isUpperCase(c)) {
                upperCase++;
            }
            if (Character.isLowerCase(c)){
                lowerCase++;
            }

            if (digit>0 && lowerCase>0 && upperCase>0 && specialCharacter>0){
                result = true;
            } else {
                result = false;

            }

        }

        System.out.println(result);
}
}
/*
String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
 */
