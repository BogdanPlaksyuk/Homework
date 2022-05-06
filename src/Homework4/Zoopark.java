package Homework4;

public class Zoopark {
    int bear = 5;
    int tiger = 10;
    int parrot = 20;
    int elefant = 3;
    int racoon = 15;
    int dickobraz = 30;
    double dickobrazplus = 0.15;
    double bearplus = 0.3;
    double tigerplus = 0.2;
    double parrotplus = 0.4;
    double elefantplus = 0.5;
    double racoonplus = 0.8;

    public static void main(String[] args) {
        Zoopark zoopark = new Zoopark();
        zoopark.countanimals();
        zoopark.aniamlsnextyear();
        zoopark.aniamlsnextyeardick();
    }

    public int countanimals() {
        int animals = bear + tiger + parrot + elefant + racoon;
        System.out.println("Всего зверей в зоопарке на текущий год: " + animals);
        return animals;
    }
    public int aniamlsnextyear(){
        int animalsnext = (int)(bear*(1+bearplus))+(int)(tiger*(1+tigerplus))+(int)(parrot*(1+parrotplus))+(int)(elefant*(1+elefantplus))+(int)(racoon*(1+racoonplus));
        System.out.println("Всего зверей в зоопарке на текущий год: " + animalsnext);
        return animalsnext;
    }
    public int aniamlsnextyeardick(){
        int animalsnextdick = (int)(bear*(1+bearplus))+(int)(tiger*(1+tigerplus))+(int)(parrot*(1+parrotplus))+(int)(elefant*(1+elefantplus))+(int)(racoon*(1+racoonplus))+(int)(dickobraz*(1+dickobrazplus));
        System.out.println("Всего зверей в зоопарке на текущий год: " + animalsnextdick);
        return animalsnextdick;
    }

}
