import java.util.Scanner;

public class Outpatient extends Hospital.Person {
    private String medicine;
    private int hours;
    private final Scanner input = new Scanner(System.in);

    public Outpatient() {
        super();
        this.medicine = "";
    }
    public void medication(){
        System.out.println("Medication prescribed for outpatient.");
        medicine=input.nextLine();
    }
    public void hourServed(){
        System.out.println(getName() + ", how many hours have you been served?");
        int hours=input.nextInt();
        this.hours=hours;

    }

    public String getMedicine() {
        return medicine;
    }

    public int getHours() {
        return hours;
    }

public void displayInfo() {
    System.out.println("Outpatient Information:");
    System.out.println("Name: " + getName());
    System.out.println("Age: " + getAge());
    System.out.println("Address: " + getAddress());
    System.out.println("Phone Number: " + getPhoneNumber());
}
}