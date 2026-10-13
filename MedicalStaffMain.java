package labsheet05.question16;

class MedicalStaff {
    protected int staffId;
    protected String staffName;

    public MedicalStaff(int staffId, String staffName) {
        this.staffId = staffId;
        this.staffName = staffName;
    }
}

class Doctor extends MedicalStaff {
    private String specialization;

    public Doctor(int staffId, String staffName, String specialization) {
        super(staffId, staffName);
        this.specialization = specialization;
    }

    public void displayDoctor() {
        System.out.println("Doctor ID: " + staffId);
        System.out.println("Doctor name: " + staffName);
        System.out.println("Specialization: " + specialization);
    }
}

class Pharmacist extends MedicalStaff {
    private String licenseNo;

    public Pharmacist(int staffId, String staffName, String licenseNo) {
        super(staffId, staffName);
        this.licenseNo = licenseNo;
    }

    public void displayPharmacist() {
        System.out.println("Pharmacist ID: " + staffId);
        System.out.println("Pharmacist name: " + staffName);
        System.out.println("License number: " + licenseNo);
    }
}

public class MedicalStaffMain {
    public static void main(String[] args) {
        Doctor doctor = new Doctor(601, "Asha Perera", "Pediatrics");
        Pharmacist pharmacist = new Pharmacist(602, "Ravi Kumar", "PH-6402");
        doctor.displayDoctor();
        pharmacist.displayPharmacist();
    }
}