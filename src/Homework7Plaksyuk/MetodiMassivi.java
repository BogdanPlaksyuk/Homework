package Homework7Plaksyuk;

import java.util.Scanner;

public class MetodiMassivi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minvalue = -20;
        int maxvalue = 20;
        System.out.println("Введите величину массива:");
        int length = scanner.nextInt();
        int[] massiv = new int[length];
        int max = minvalue;
        int min = maxvalue;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            massiv[i] = (int) (Math.random() * (maxvalue - minvalue + 1))+minvalue;
            System.out.print(massiv[i] + " ");
            sum = sum + massiv[i];
            if (massiv[i] > max) {
                max = massiv[i];
            }
            if (massiv[i] < min) {
                min = massiv[i];
            }
            if (i >= massiv.length - 1) {
                System.out.println();
                System.out.println("Максимальное значение числа в массиве: " + max);
                System.out.println("Минимальное  значение числа в массиве: " + min);
                System.out.println("Среднее арифметическое всех чисел в массиве: " + (double) sum / length);
            }
        }
    }
}
