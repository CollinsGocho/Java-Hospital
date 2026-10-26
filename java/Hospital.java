import java.util.*;
public class Hospital {
    private String name;
    private String address;
    private List<Doctor> doctors;
    private List<Person> patients;
    private static final Scanner sc = new Scanner(System.in);

    public Hospital() {
        System.out.println("Enter the hospital name:");
        name = sc.nextLine();
        System.out.println("Enter the hospital address:");
        address = sc.nextLine();
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Person patient) {
        patients.add(patient);
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public List<Person> getPatients() {
        return patients;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    public static class Person {
        private String name;
        private int yearOfBirth;
        private String gender;
        private String address;
        private String phoneNumber;
        
        public Person() {
            System.out.println("Enter your name:");
            name=sc.nextLine();
            System.out.println("Enter your year of birth:");
            yearOfBirth=sc.nextInt();
            sc.nextLine(); 
            System.out.println("Enter your gender:");
            gender=sc.nextLine();
            System.out.println("Enter your address:");
            address=sc.nextLine();  
            System.out.println("Enter your phone number:");
            phoneNumber=sc.nextLine();
        }
        public String getName() {
            return name;
        }
        public int getAge() {
            int currentYear = java.time.Year.now().getValue();
            return currentYear-yearOfBirth;
        }
        public String getGender() {
            return gender;
        }
        public String getAddress() {
            return address;
        }
        public String getPhoneNumber() {
            return phoneNumber;
        }
        public int getYearOfBirth() {
            return yearOfBirth;
        }

    }
    
    class Doctor {
        private String name;
        private String specialization;

        public Doctor(String name, String specialization) {
            this.name = name;
            this.specialization = specialization;
        }

        public String getName() {
            return name;
        }

        public String getSpecialization() {
            return specialization;
        }

    }
    public void displayDoctors() {
        System.out.println("List of Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("Name: " + doctor.getName() + ", Specialization: " + doctor.getSpecialization());
        }
    }
    public void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.addDoctor(new Doctor("Dr. Smith", "Cardiology"));
        hospital.addDoctor(new Doctor("Dr. Johnson", "Neurology"));
        hospital.displayDoctors();

        Outpatient outpatient = new Outpatient();
        outpatient.medication();
        outpatient.hourServed();
        outpatient.displayInfo();
        Inpatient inpatient = new Inpatient();
        inpatient.assignRoom();
        inpatient.daysAdmitted();
        inpatient.assignNurse();
        inpatient.displayInfo();

    }
}