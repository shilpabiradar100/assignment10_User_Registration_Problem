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
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Registration System");
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter firstname: ");
        String FirstName = input.nextLine();
        System.out.println(firstNameValidation(FirstName));
    }
}
