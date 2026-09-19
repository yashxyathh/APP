import doctor.Doctor;
import patient.Patient;

public class doc {
    public static void main(String[] args) {

        Doctor d1 = new Doctor(101, "Dr. Sharma", "Cardiologist", 1000);
        Doctor d2 = new Doctor(102, "Dr. Mehta", "Dermatologist", 800);

        Patient p1 = new Patient(201, "Rahul", "Heart Disease", 45);
        Patient p2 = new Patient(202, "Priya", "Skin Allergy", 25);
        Patient p3 = new Patient(203, "Aman", "Heart Disease", 50);

        System.out.println("Patient 1:");
        p1.display();
        System.out.println("Treating Doctor:");
        d1.display();

        System.out.println("\nPatient 2:");
        p2.display();
        System.out.println("Treating Doctor:");
        d2.display();

        System.out.println("\nPatient 3:");
        p3.display();
        System.out.println("Treating Doctor:");
        d1.display();

        int patientsD1 = 2;
        int patientsD2 = 1;

        double totalD1 = patientsD1 * d1.getConsultationFee();
        double totalD2 = patientsD2 * d2.getConsultationFee();

        System.out.println("\nTotal Consultation Fee:");
        System.out.println(d1.getName() + ": " + totalD1);
        System.out.println(d2.getName() + ": " + totalD2);
    }
}