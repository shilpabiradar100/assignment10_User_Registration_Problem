package org.example;

import java.util.Scanner;
import utility.UtilRegex;
import utility.UtilValidation;


public class UserMain {
    public static void main(String[] args) {
        String firstName, lastName, email, mobileNumber, password;

        String[] email1 = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
                "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com" };
        String[] email2 = { "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com",
                "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com",
                "abc@gmail.com.1a", "abc@gmail.com.aa.au" };

        System.out.println("Welcome to User Registration program");

        System.out.println("Enter First Name : ");
        Scanner sc = new Scanner(System.in);
        firstName = sc.next();

        if (!UtilValidation.checkRegex(firstName, UtilRegex.name)) {
            System.out.println("Please enter a valid name.");
        }

        System.out.println("Enter Last Name : ");
        Scanner sc1 = new Scanner(System.in);
        lastName = sc1.next();

        if (!UtilValidation.checkRegex(lastName, UtilRegex.name)) {
            System.out.println("Please enter a valid name.");
        }

        System.out.println("Enter email : ");
        Scanner sc2 = new Scanner(System.in);
        email = sc2.next();

        if (!UtilValidation.checkRegex(email, UtilRegex.email)) {
            System.out.println("Please enter a email.");
        }

        System.out.println("Enter mobile number : ");
        Scanner sc3 = new Scanner(System.in);
        mobileNumber = sc3.nextLine();

        if (!UtilValidation.checkRegex(mobileNumber, UtilRegex.mobileNumber)) {
            System.out.println("Please enter a valid mobile number.");
        }

        System.out.println("Enter password : ");
        Scanner sc4 = new Scanner(System.in);
        password = sc4.next();

        if (!UtilValidation.checkRegex(password, UtilRegex.password)) {
            System.out.println("Please enter a valid password.");
        }

        checkEmails(email1);
        checkEmails(email2);
    }

    static void checkEmails(String[] emails) {
        for(String email : emails) {
            if (UtilValidation.checkRegex(email, UtilRegex.email)) {
                System.out.println("valid -> " +email);
            }else {
                System.out.println("Not valid -> " +email);
            }
        }
        System.out.println("");
    }
}