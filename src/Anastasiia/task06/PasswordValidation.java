package Anastasiia.task06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PasswordValidation {

    public static void main(String[] args) {

        String password = "aaaaaa",
                password1 = "Ab1 2%",
                password2 = "123",
                password3 = "AbC112",
                password4 = "AzQw!!",
                passwordValid = "AcDe#4%6h";
        System.out.println(password + " : " + isPasswordValid(password));
        System.out.println(password1 + " : " + isPasswordValid(password1));
        System.out.println(password2 + " : " + isPasswordValid(password2));
        System.out.println(password3 + " : " + isPasswordValid(password3));
        System.out.println(password4 + " : " + isPasswordValid(password4));
        System.out.println(passwordValid + " : " + isPasswordValid(passwordValid));


    }


    public static boolean isPasswordValid(String password) {

        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        if(password.length()<6 || password.contains(" ")){
            System.out.println("Password has to contain at least 6 characters and no space");
            return false;
        }

            for (int i = 0; i < password.length(); i++) {

                if (Character.isLowerCase(password.charAt(i))) {
                    hasLowerCase = true;
                } else if (Character.isUpperCase(password.charAt(i))) {
                    hasUpperCase = true;
                } else if (Character.isDigit(password.charAt(i))) {
                    hasDigit = true;
                } else {
                    hasSpecialChar = true;
                }
            }

        if (hasLowerCase && hasUpperCase && hasDigit && hasSpecialChar ){
            return true;
        }else{
            System.out.println("Password has to contain at least 1 lower case letter, 1 upper case letter, 1 digit and 1 special character");
        }

        return false;
    }

}


//String -- Password Validation Task
//1. Write a return method that can verify if a password is valid or not.
//requirements:
//1. Password MUST be at least have 6 characters and should not contain space
//2. PassWord should at least contain one upper case letter
//3. PassWord should at least contain one lowercase letter
//4. Password should at least contain one special characters
//5. Password should at least contain a digit
//if all requirements above are met, the method returns true, otherwise returns false