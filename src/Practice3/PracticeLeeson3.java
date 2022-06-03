package Practice3;

public class PracticeLeeson3 {
    public static void main(String[] args) {
        Double a = new Double(45);
        Double b = new Double(30);
        Double c = new Double(10);
        Double result1;
        Double result2;
        result1 = Math.abs(a-b) / Math.pow((a+b), 3)- Math.sqrt(c);
        result2 = (a+b)/12*(c%4)+ Math.abs(b);
        System.out.println(result1);
        System.out.println(result2);

    }
}
