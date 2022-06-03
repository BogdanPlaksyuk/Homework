package Homework4;

public class ZooparkTask3 {
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

        ZooparkTask3 zoopark = new ZooparkTask3();
        int sum =zoopark.years(10);
        System.out.println("Зверей через введенное кол-во лет: ");
        System.out.println(sum);
    }

    public int years(int n) {
     for (int i=1; i<=n; i++){
         bear+= (int)(bear*bearplus);
         tiger+=(int)(tiger*tigerplus);
         parrot+=(int)(parrot*parrotplus);
         elefant+=(int)(elefant*elefantplus);
         racoon+=(int)(racoon*racoonplus);
         dickobraz+=(int)(dickobraz*dickobrazplus);
     }
     return bear+tiger+parrot+elefant+racoon+dickobraz;


    }
}
