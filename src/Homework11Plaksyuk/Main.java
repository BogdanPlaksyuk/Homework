package Homework11Plaksyuk;


public class Main {
    public static void main(String[] args) {
        Registration user001 = new Registration("John", 10, 5, 1990, "john@yahoo.com", "8800555",
                "Banks", 90, "120/70", 3200);
        Registration user002 = new Registration("Mark", 15, 9, 1980, "mark@yahoo.com", "8800544",
                "Spencer", 80, "130/70", 6200);
        Registration user003 = new Registration("Jack", 30, 10, 1990, "jack@yahoo.com", "881235",
                "Beans", 66, "100/60", 9200);
        printAccountInfo(user001);
        System.out.println();
        printAccountInfo(user002);
        System.out.println();
        printAccountInfo(user003);
        System.out.println();
        user001.setBloodPressure("150/90");
        user001.setWeight(70);
        user002.setLastname("Jackson");
        user002.setSteps(20000);
        System.out.println("After changes");
        System.out.println();
        printAccountInfo(user001);
        System.out.println();
        printAccountInfo(user002);


    }

    public static void printAccountInfo(Registration user) {
        System.out.println("Firstname: " + user.getFirstName());
        System.out.println("Lastname: " + user.getLastname());
        System.out.println("Day of birth: " + user.getDOB());
        System.out.println("Month of birth: " + user.getMOB());
        System.out.println("Year of birth: " + user.getYOB());
        System.out.println("email: " + user.getEmail());
        System.out.println("Phone number: " + user.getPhoneNumber());
        System.out.println("Weight: " + user.getWeight());
        System.out.println("Blood pressure: " + user.getBloodPressure());
        System.out.println("Steps: " + user.getSteps());
        System.out.println("Age: " + user.getAge(user.getYOB()));

    }
}
