package Homework7Plaksyuk;

public class Rugby {
    public static void main(String[] args) {
        int[] komanda1 = new int[25];
        int[] komanda2 = new int[25];
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 25; i++) {
            komanda1[i] = (int) (Math.random() * (40 - 18 + 1) + 18);
            System.out.print(komanda1[i]);
            sum1 = sum1 + komanda1[i];
            if (i < 24) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
        for (int i = 0; i < 25; i++) {
            komanda2[i] = (int) (Math.random() * (40 - 18 + 1) + 18);
            System.out.print(komanda2[i]);
            sum2 = sum2 + komanda2[i];
            if (i < 24) {
                System.out.print(" ");
            }
            else {
                System.out.println();
            }
        }
        double ave1=(double)sum1/komanda1.length;
        double ave2=(double)sum2/komanda2.length;
        System.out.println("Средний возраст игроков команды 1- "+ ave1);
        System.out.println("Средний возраст игроков команды 2- "+ ave2);
    }
}
