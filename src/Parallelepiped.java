public class Parallelepiped {
    public static void main(String[] args) {
        float a=4.5F;
        float b=3.2F;
        float c=9.9F;
        float volume = a*b*c;
        float length = 4*(a+b+c);
        System.out.println("Об’єм паралелепіпеда = "+ volume);
        System.out.printf("Сумарна довжина всіх сторін паралелепіпеда = "+ "%.2f", length);
    }
}
