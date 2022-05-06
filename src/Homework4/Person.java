package Homework4;

public class Person {
    public static void main(String[] args) {

        Person person = new Person();
        person.personinfo("Will", "Smith", "New York", "2936729462846");
        person.personinfo("Jackie", "Chan", "Shanghai", "12312412412");
        person.personinfo("Sherlock", "Holmes", "London", "2936729462568");
    }

    public void personinfo(String firstname, String lastname, String city, String phone) {
        System.out.println("Зателефонувати громадянину " + firstname + " " + lastname + " з міста " + city + " можна за номером " + phone + ".");
    }
}
