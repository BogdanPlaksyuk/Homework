package Homework12Plaksyuk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wholePrice = 0;
        int counter = 0;
        int a;

        do {
            System.out.println("Введите номер вашего напитка. 1 - кофе 2 - чай 3 - лимонад 4 - мохито 5 - минералка 6 - кола 0 - закончить");
            a = scanner.nextInt();
            if (a == 1) {
                Drinks drink1 = new Drinks(DrinksMachine.COFFEE);
                drink1.priceCount();
                int price1 = drink1.price;
                wholePrice += price1;
                counter++;
            } else if (a == 2) {
                Drinks drink2 = new Drinks(DrinksMachine.TEA);
                drink2.priceCount();
                int price2 = drink2.price;
                wholePrice += price2;
                counter++;
            } else if (a == 3) {
                Drinks drink3 = new Drinks(DrinksMachine.LIMO);
                drink3.priceCount();
                int price3 = drink3.price;
                wholePrice += price3;
                counter++;
            } else if (a == 4) {
                Drinks drink4 = new Drinks(DrinksMachine.MOHITO);
                drink4.priceCount();
                int price4 = drink4.price;
                wholePrice += price4;
                counter++;
            } else if (a == 5) {
                Drinks drink5 = new Drinks(DrinksMachine.MINERAL_WATER);
                drink5.priceCount();
                int price5 = drink5.price;
                wholePrice += price5;
                counter++;
            } else if (a == 6) {
                Drinks drink6 = new Drinks(DrinksMachine.COCA_COLA);
                drink6.priceCount();
                int price6 = drink6.price;
                wholePrice += price6;
                counter++;
            }
        }
        while (a != 0);
        System.out.println("Общая стоимость заказа: " + wholePrice);
        System.out.println("Количество напитков: " + counter);
    }

}
