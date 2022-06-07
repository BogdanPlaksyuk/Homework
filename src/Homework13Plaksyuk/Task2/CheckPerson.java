package Homework13Plaksyuk.Task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPerson {
    public static void main(String[] args) {
        String[] userNameString = new String[]{"VOVA", "Ivan", "R2d2", "ZX", "Anna",
                "12345", "ToAd", "TomCat", " "};
        for (String s : userNameString) {
            checkPersonWithRegExp(s);
        }
    }

    public static void checkPersonWithRegExp(String userName) {
        String regex = "^[A-Z][a-z]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userName);
        System.out.println(userName + " is " + matcher.find());
    }
}
