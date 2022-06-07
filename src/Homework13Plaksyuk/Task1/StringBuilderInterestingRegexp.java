package Homework13Plaksyuk.Task1;

public class StringBuilderInterestingRegexp {
    public static void main(String[] args) {
        String str = "Using methods of class String";
        String result = new StringBuilder(str).reverse().toString();
        result = result.replaceAll("(.)(?=.*\\1)", "");
        result = new StringBuilder(result).reverse().toString();
        System.out.println(result);
    }
}
