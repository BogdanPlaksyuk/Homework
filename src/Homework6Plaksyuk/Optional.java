package Homework6Plaksyuk;

public class Optional {
    public static void main(String[] args) {
        int i;
        int j;
        char c = 'A';

        for (j = 1; j < 10; j++) {
            for (i = 1; i <= j; i++) {
                if (!(j % 2 == 0)) {
                    System.out.print(c);
                    c++;
                } else {
                    System.out.print(j-i+1);
                }
            }

            System.out.println();

        }
        System.out.println();
    }
}
