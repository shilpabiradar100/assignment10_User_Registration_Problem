package org.example;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserMain {
    public static boolean firstNameValidation(String FirstName){
        String regex = "^[A-Z]{1}[a-z A-Z]{2,}$";
        Pattern p = Pattern.compile(regex);
        if (FirstName == null){
            return false;
        }
        Matcher m = p.matcher(FirstName);
        return m.matches();

    }

    public static boolean lastNameValidation(String LastName){
        String regex = "^[A-Z]{1}[a-z A-Z]{2,}$";
        Pattern p = Pattern.compile(regex);
        if (LastName == null){
            return false;
        }
        Matcher m = p.matcher(LastName);
        return m.matches();

    }

    public static boolean emailValidation(String Email){
        String regexEmail = "^[0-9 A-Z a-z]+(([._+-]*)[0-9A-Za-z]+)*@[0-9 A-Z a-z]+.[a-z]{2,4}([.][a-z]{2,3})*$";
        Pattern p = Pattern.compile(regexEmail);
        if (Email == null) {
            return false;
        }
        Matcher m = p.matcher(Email);
        return  m.matches();

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Registration System");
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter your firstname: ");
        String FirstName = input.nextLine();
        System.out.println(firstNameValidation(FirstName));

        System.out.println("Please Enter your lastname: ");
        String LastName = input.nextLine();
        System.out.println(lastNameValidation(LastName));

        System.out.println("Please Enter your Email: ");
        String EmailID = input.nextLine();
        System.out.println(emailValidation(EmailID));


    }
}
