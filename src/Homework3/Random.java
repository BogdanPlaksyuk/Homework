package Homework3;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите нижнюю границу диапозона(целое число): ");
        int max = sc.nextInt();
        System.out.println("Введите верхнюю границу диапозона(целое число): ");
        int min = sc.nextInt();
        int a = (int) (Math.random() * (max - min) + min);
        System.out.println("Ваше случайное число в указанном диапозоне: \n" + a);
    }
}
