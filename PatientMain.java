package labsheet05.question07;

class Patient {
    private String patientName;
    private int age;
    private double weight;

    public Patient(String patientName, int age, double weight) {
        this.patientName = patientName;
        this.age = age;
        this.weight = weight;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age must not be negative; the previous age was kept.");
        }
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight must be positive; the previous weight was kept.");
        }
    }

    public void displayPatient() {
        System.out.println("Patient: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
}

public class PatientMain {
    public static void main(String[] args) {
        Patient patient = new Patient("Asha", 25, 58.5);
        patient.setAge(26);
        patient.setAge(-4);
        patient.setWeight(60.0);
        patient.setWeight(0.0);
        patient.displayPatient();
    }
}