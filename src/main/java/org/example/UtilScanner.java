package org.example;
import java.util.Scanner;
public class UtilScanner {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int getInt(String message) {
        message(message);
        return SCANNER.nextInt();
    }

    public static String getString(String message) {
        message(message);
        return SCANNER.next();
    }

    private static void message(String msg) {
        System.out.print("Enter the " + msg);
    }
}
