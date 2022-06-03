package Homework12Plaksyuk;

public class Drinks {
    DrinksMachine drinksMachine;

    public Drinks(DrinksMachine drinksMachine) {
        this.drinksMachine = drinksMachine;
    }

    public static final int cofeePrice = 10;
    public static final int teaPrice = 8;
    public static final int limoPrice = 15;
    public static final int mohitoPrice = 20;
    public static final int mineralPrice = 6;
    public static final int colaPrice = 12;
    public int price;

    public void priceCount() {
        switch (drinksMachine) {
            case COFFEE:
                price = cofeePrice;
                System.out.println("Вы выбрали кофе, цена: " + price);
                break;
            case TEA:
                price = teaPrice;
                System.out.println("Вы выбрали чай, цена: " + price);
                break;
            case LIMO:
                price = limoPrice;
                System.out.println("Вы выбрали лимонад, цена: " + price);
                break;
            case MOHITO:
                price = mohitoPrice;
                System.out.println("Вы выбрали мохито, цена: " + price);
                break;
            case COCA_COLA:
                price = colaPrice;
                System.out.println("Вы выбрали колу, цена: " + price);
                break;
            case MINERAL_WATER:
                price = mineralPrice;
                System.out.println("Вы выбрали минералку, цена: " + price);
                break;
        }
    }

}
