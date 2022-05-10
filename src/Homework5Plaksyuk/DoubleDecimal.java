package Homework5Plaksyuk;

import java.util.Scanner;

public class DoubleDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше число с дробной частью:");
        double number = scanner.nextDouble();
        System.out.println("Сколько знаков после запятой хотите оставить?");
        int countAfterPoint =scanner.nextInt();
  double result = doubleToDecimalPlaces(number, countAfterPoint);
        System.out.println("Магическим образом получаем результат:    " + result);

    }
    private static double doubleToDecimalPlaces(double number, int countAfterPoint){
        int scale = (int)(Math.pow(10, countAfterPoint));
        return (double) (Math.round(number*scale))/scale;



    }
}
