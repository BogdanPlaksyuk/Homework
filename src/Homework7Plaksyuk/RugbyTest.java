package Homework7Plaksyuk;

public class RugbyTest {
    public static void main(String[] args) {
        int min = 18;
        int max = 40;
        int[] komanda = new int[25];
        int teamnumber = 2;
        int sum = 0;
        for (int j = 0; j < teamnumber; j++) {
            for (int i = 0; i < komanda.length; i++) {
                komanda[i] = (int) (Math.random() * (max - min + 1) )+ min;
                System.out.print(komanda[i]);
                sum = sum + komanda[i];
                if (i < komanda.length-1) {
                    System.out.print(" ");
                } else {
                    System.out.println();
                    System.out.println("Средний возраст команды " + (j + 1) + " - " + (double) (sum / komanda.length) );
                    sum=0;
                }
            }
        }
    }
}

