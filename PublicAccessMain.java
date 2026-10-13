package labsheet05.question09;

class Hospital {
    // Public members can be accessed directly outside this class.
    public String hospitalName = "City General Hospital";
    public String hospitalCode = "CGH101";

    public Hospital() {
    }

    public void displayHospital() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Code: " + hospitalCode);
    }
}

public class PublicAccessMain {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        System.out.println("Name accessed directly: " + hospital.hospitalName);
        System.out.println("Code accessed directly: " + hospital.hospitalCode);
        hospital.displayHospital();
    }
}