package Homework11Plaksyuk;

public class Registration {
    private String firstName;
    private int dOB;
    private int mOB;
    private int yOb;
    private String email;
    private String phoneNumber;
    private String lastname;
    private int weight;
    private String bloodPressure;
    private int steps;

    public Registration(String firstName, int dOB, int mOB, int yOb, String email, String phoneNumber,
                        String lastname, int weight, String bloodPressure, int steps) {
        this.firstName = firstName;
        this.dOB = dOB;
        this.mOB = mOB;
        this.yOb = yOb;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.lastname = lastname;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.steps = steps;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getDOB() {
        return dOB;
    }

    public int getMOB() {
        return mOB;
    }

    public int getYOB() {
        return yOb;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getLastname() {
        return lastname;
    }

    public int getWeight() {
        return weight;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public int getSteps() {
        return steps;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getAge(int yOB) {
        int age = 2022 - yOB;
        return age;
    }


}
