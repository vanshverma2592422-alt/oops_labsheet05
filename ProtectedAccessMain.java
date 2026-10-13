package labsheet05.question12;

class HospitalStaff {
    protected int staffId;
    protected String staffName;

    protected HospitalStaff(int staffId, String staffName) {
        this.staffId = staffId;
        this.staffName = staffName;
    }

    protected void displayStaff() {
        System.out.println("Staff ID: " + staffId);
        System.out.println("Staff name: " + staffName);
    }
}

class Pharmacist extends HospitalStaff {
    private String licenseNo;

    public Pharmacist(int staffId, String staffName, String licenseNo) {
        super(staffId, staffName);
        this.licenseNo = licenseNo;
    }

    public void displayPharmacist() {
        System.out.println("Staff ID: " + staffId);
        System.out.println("Staff name: " + staffName);
        System.out.println("License number: " + licenseNo);
        displayStaff();
    }
}

public class ProtectedAccessMain {
    public static void main(String[] args) {
        Pharmacist pharmacist = new Pharmacist(201, "Ravi Kumar", "PH-7781");
        pharmacist.displayPharmacist();
    }
}