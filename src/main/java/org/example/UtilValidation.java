package org.example;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UtilValidation {
    public static boolean checkRegex(String input, String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }
}
