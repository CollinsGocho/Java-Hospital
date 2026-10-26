import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Inpatient extends Hospital.Person {
    private String roomNumber;
    private int daysAdmitted;
    private Scanner input = new Scanner(System.in);
    private String nurseAssigned;
    private HashMap<Integer, String> nurseAssignments = new HashMap<>();
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phoneNumber;

    public Inpatient() {
        super();
        this.name = super.getName();
        this.age = super.getAge();
        this.gender = super.getGender();
        this.address = super.getAddress();
        this.phoneNumber = super.getPhoneNumber();
        nurseAssignments.put(1, "Nzambani Alan");
        nurseAssignments.put(2, "Brian Kamau");
        nurseAssignments.put(3, "Afraha Kimani");
        nurseAssignments.put(4, "Alice Mwende");
        nurseAssignments.put(5, "Mary Wanjiku");
        nurseAssignments.put(7, "Chege Wanjiru");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void nurseAssignment(int nurseId, String nurseName) {
        nurseAssignments.put(nurseId, nurseName);
    }

   

    public void assignRoom() {
       Random rand = new Random();
        int roomNum = rand.nextInt(100) + 1; 
        this.roomNumber = "Room " + roomNum;
        System.out.println("Assigned " + roomNumber + " to inpatient.");
    }
    public void daysAdmitted() {
        System.out.println("How many days have you been admitted?");
        int days = input.nextInt();
        this.daysAdmitted = days;
    }
    public void assignNurse() {
        String[] availableNurses = nurseAssignments.values().toArray(new String[0]);
        int nurseIndex = new Random().nextInt(availableNurses.length);
        nurseAssigned = availableNurses[nurseIndex];
        System.out.println("Assigned Nurse: " + nurseAssigned);
    }
     /**
     * 
     */
    public void displayInfo() {
        System.out.println("Inpatient Information:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Days Admitted: " + daysAdmitted);
        System.out.println("Nurse Assigned: " + nurseAssigned);
    }
}
