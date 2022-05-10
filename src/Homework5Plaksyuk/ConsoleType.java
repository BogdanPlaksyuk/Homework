package Homework5Plaksyuk;

import java.util.Scanner;

public class ConsoleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше число:");
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            {
                if (i > 0) {
                    System.out.println("Вы ввели целочисленное положительное значение:   " + i);
                }
                if (i < 0) {
                    System.out.println("Вы ввели целочисленное отрицательное значение:   " + i);
                }
                if (i == 0) {
                    System.out.println("Вы ввели 0");
                }
            }
        } else if (scanner.hasNextDouble()) {
            double i = scanner.nextDouble();
            System.out.print("Вы ввели число с дробной частью:   ");
            System.out.printf("%.2f", i);

        } else {
            String i = scanner.nextLine();
            String i1 = i.toUpperCase();
            String i2 = i1.trim();
            System.out.println("Введеные данные не являются числом:  " + i1);
        }
    }

}
