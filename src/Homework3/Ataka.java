package Homework3;

public class Ataka {
    public static void main(String[] args) {
        int voinLi = 13;
        int luchnikLi = 24;
        int vershnikLi = 46;
        int voinMin = 9;
        int luchnikMin = 35;
        int vershnikMin = 12;
        int armiaLi = 860;
        int armiaMin = (int) (armiaLi * 1.5);
        int atakaLi = (voinLi + luchnikLi + vershnikLi) * armiaLi;
        int atakaMin = (voinMin + luchnikMin + vershnikMin) * armiaMin;
        System.out.println("Суммарная атака армии Ли: " + atakaLi);
        System.out.println("Суммарная атака армии Минь: " + atakaMin);
    }
}
