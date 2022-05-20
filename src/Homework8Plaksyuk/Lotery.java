package Homework8Plaksyuk;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotery {
    public static void main(String[] args) {
        int min = 0;
        int max = 9;
        int countofballs = 7;
        int countequal=0;
        int[] random = randomcreate(min, max, countofballs);
        int[] choice = choicecreate(min, max, countofballs);
        System.out.println("Случаные числа до сортировки:    " + Arrays.toString(random));
        System.out.println("Введенные числа до сортировки:   " + Arrays.toString(choice));
        Arrays.sort(random);
        System.out.println("Случайные числа после сортировки:"+ Arrays.toString(random));
        Arrays.sort(choice);
        System.out.println("Введенные числа после сортировки:" + Arrays.toString(choice));
        for (int i=0;i<countofballs;i++) {
            if (random[i]==choice[i]){
                System.out.println("Совпал элемент № "+(i+1));
                countequal++;
            }
        }
        System.out.println("Всего совпало "+ countequal+ " чисел");
    }

    public static int[] randomcreate(int min, int max, int countofballs) {
        Random random = new Random();
        int[] balls = new int[countofballs];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = random.nextInt(max - min + 1) + min;
        }
        return balls;
    }

    public static int[] choicecreate(int min, int max, int countofballs) {
        Scanner scanner = new Scanner(System.in);
        int[] balls = new int[countofballs];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = scanner.nextInt();
            if ((balls[i] < min) || (balls[i] > max)) {
                System.out.println("Число не попадает в указанный диапозон, введите снова от 0 до 9");
                i--;
            }
        }
        return balls;
    }
}
