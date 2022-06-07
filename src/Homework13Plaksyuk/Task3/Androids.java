package Homework13Plaksyuk.Task3;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Ваш Андроид звонит");
    }

    @Override
    public void sms() {
        System.out.println("На ваш Андроид пришло SMS");
    }

    @Override
    public void internet() {
        System.out.println("Ваш Андроид подключен к Internet");
    }

    @Override
    public void touchID() {
        System.out.println("Ваш отпечаток распознан");
    }
}
