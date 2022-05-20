package Homework8Plaksyuk;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        int length = 20;
        int[] ourarray = createarray(min, max, length);
        Arrays.sort(ourarray);
        System.out.println(Arrays.toString(ourarray));
        Scanner scanner = new Scanner(System.in);
        int x;
        do{
            System.out.println("Введите число, которое попадает в границу значений массива");
        x = scanner.nextInt();}
        while (x<ourarray[0]||x>ourarray[length-1]);
        binarySearch(ourarray, 0, length-1, x);
    }

    public static int[] createarray(int min, int max, int length) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

    public static void binarySearch(int[] array, int first, int last, int item) {
        int position = (first + last) / 2;
        while (first <= last) {
            if (array[position] < item) {
                first = position + 1;
            } else if (array[position] == item) {
                System.out.println(item + " Найдено на позиции № "+ (position+1));
                break;
            } else {
                last = position - 1;
            }
            position = (first + last) / 2;
        }
        if (first > last) {
            System.out.println(item + " Не существует в массиве");
        }
    }
}