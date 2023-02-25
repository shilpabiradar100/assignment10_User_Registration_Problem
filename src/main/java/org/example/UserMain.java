package org.example;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserMain {
    public static boolean firstNameValidation(String FirstName){
        String regexFirstName = "^[A-Z][a-z A-Z]{2,}$";
        Pattern p = Pattern.compile(regexFirstName);
        if (FirstName == null) {
            return false;
        }
        Matcher m = p.matcher(FirstName);
        return m.matches();
    }

    public static boolean lastNameValidation(String LastName){
        String regexLastName = "^[A-Z][a-z A-Z]{2,}$";
        Pattern p = Pattern.compile(regexLastName);
        if (LastName == null){
            return false;
        }
        Matcher m = p.matcher(LastName);
        return m.matches();

    }
    public static void emailValidation() {
        ArrayList<String> emails = new ArrayList<String>();
        emails.add("abc@yahoo.com");
        emails.add("abc-100@yahoo.com");
        emails.add("abc.100@yahoo.com");
        emails.add("abc111@abc.com");
        emails.add("abc-100@abc.net");
        emails.add("abc.100@abc.com.au");
        emails.add("abc@1.com");
        emails.add("abc@gmail.com");
        emails.add("abc@gmail.com.com");
        emails.add("abc+100@gmail.com");

        emails.add("abc");
        emails.add("abc@.com.my");
        emails.add("abc123@gmail.a");
        emails.add("abc123@.com");
        emails.add("abc123@.com.com");
        emails.add(".abc@abc.com");
        emails.add("abc()*@gmail.com");
        emails.add("abc@%*.com");
        emails.add("abc..2002@gmail.com");
        emails.add("abc.@gmail.com");
        emails.add("abc@abc@gmail.com");
        emails.add("abc@gmail.com.1a");
        emails.add("abc@gmail.com.aa.au");

        String regexEmail = "^[0-9 A-Z a-z]+(([._+-]*)[0-9A-Za-z]+)*@[0-9 A-Z a-z]+.[a-z]{2,4}([.][a-z]{2,3})*$";
        Pattern p = Pattern.compile(regexEmail);

        for (String Email : emails) {
            //Create instance of matcher
            Matcher matcher = p.matcher(Email);
            System.out.println(emails + " : " + matcher.matches() + "\n");
        }
    }
    public static boolean mobileNumValidation(String MobileNum ){
        String regexMobileNum = "^[9][1]\\s[6-9][0-9]{9}$";
        Pattern p = Pattern.compile(regexMobileNum);
        if (MobileNum == null){
            return false;
        }
        Matcher m =p.matcher(MobileNum);

        return m.matches();

    }
    public static boolean PasswordValidation(String password) {
        String regexPassword = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}$";
        Pattern p = Pattern.compile(regexPassword);
        if ( password == null ){
            return false;
        }
        Matcher m = p.matcher(password);
        return m.matches();
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

        System.out.println("Lets Validate Email Address ");
        emailValidation();

        System.out.println("Please Enter the mobile number with country code 91: ");
        String MobileNum = input.nextLine();
        System.out.println(mobileNumValidation(MobileNum));

        System.out.println("please enter the Password");
        String Password = input.nextLine();
        System.out.println(PasswordValidation(Password));
    }
}