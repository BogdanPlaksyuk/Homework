package Homework13Plaksyuk.Task3;

public class Main {
    public static void main(String[] args) {
        Androids samsung = new Androids();
        IPhones iPhone11 = new IPhones();
        Smartphones[] s = new Smartphones[]{samsung, iPhone11};

        for (Smartphones smartphones : s) {
            smartphones.call();
            smartphones.internet();
            smartphones.sms();
        }
        samsung.touchID();
        iPhone11.faceID();
    }
}
