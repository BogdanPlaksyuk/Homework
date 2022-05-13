package Homework6Plaksyuk;

public class Japan {
    public static void main(String[] args) {
        int i;
        int count = 0;
        for (i = 1; ; i++) {
            String s = String.valueOf(i);
            if (!((s.contains("4")) || (s.contains("9")))) {
                count++;
                System.out.println("Шатл " + count + " имеет номер " + s);
                if (count == 100) {
                    break;
                }
            }
        }
    }
}
