package Homework13Plaksyuk.Task3;

public class IPhones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("Ваш Айфон звонит");
    }

    @Override
    public void sms() {
        System.out.println("На ваш Айфон пришло SMS");
    }

    @Override
    public void internet() {
        System.out.println("Ваш Айфон подключен к Internet");
    }

    @Override
    public void faceID() {
        System.out.println("Ваше лицо распознано");
    }
}
