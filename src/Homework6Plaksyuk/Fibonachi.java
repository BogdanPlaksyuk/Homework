package Homework6Plaksyuk;

public class Fibonachi {
    public static void main(String[] args) {
        int f1 = 0;
        int f2 = 1;
        int i;
        int n = 3;
        System.out.println("Число № 1:   " + f1);
        System.out.println("Число № 2:   " + f2);
        for (i = 1; i <= 9; i++) {
            f2 = f2 + f1;
            f1 = f2 - f1;
            System.out.println("Число № " + n + ":   " + f2);
            n++;
        }
    }
}
