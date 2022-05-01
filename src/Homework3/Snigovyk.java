package Homework3;

public class Snigovyk {
    public static void main(String[] args) {
        final double pi = 3.14159265;
        double plotnost_snega = 0.7;
        double radius1 = 1;
        double radius2 = 0.5;
        double radius3 = 0.2;
        double volume_ball1 = 4.0 / 3.0 * pi * Math.pow(radius1, 3);
        double volume_ball2 = 4.0 / 3.0 * pi * Math.pow(radius2, 3);
        double volume_ball3 = 4.0 / 3.0 * pi * Math.pow(radius3, 3);
        double mass_snowman = (volume_ball1 + volume_ball2 + volume_ball3) * plotnost_snega;
        System.out.println("Масса снеговика = " + mass_snowman + " (Кг)");
        System.out.printf("Масса снеговика округленная = " + "%.2f", mass_snowman);
        System.out.print(" (Кг)");
    }
}