package Homework13Plaksyuk.Task1;

public class Main {
    public static void main(String[] args) {
        String s = "Using methods of class String";
        uniqueChars(s);

    }

    public static void uniqueChars(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        char[] array = new char[s.length()];
        stringBuilder.getChars(0, s.length(), array, 0);
        for (int i = 0; i < s.length(); i++) {
            boolean dublicate = false;
            for (int j = i + 1; j < s.length(); j++) {
                if (array[j] == array[i]) {
                    dublicate = true;
                    break;
                }
            }
            if (!dublicate) {
                stringBuilder.append(array[i]);
                System.out.println(array[i]);
            }
        }
    }
}
