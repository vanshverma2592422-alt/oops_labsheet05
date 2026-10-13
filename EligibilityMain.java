package labsheet05.question05;

class Medicine {
    String medicineName;
    int ageLimit;

    public Medicine(String medicineName, int ageLimit) {
        this.medicineName = medicineName;
        this.ageLimit = ageLimit;
    }

    public String checkEligibility(int patientAge) {
        String result;
        if (patientAge >= ageLimit) {
            result = "Eligible";
        } else {
            result = "Not Eligible";
        }
        return result;
    }
}

public class EligibilityMain {
    public static void main(String[] args) {
        Medicine medicine = new Medicine("Adult Cough Medicine", 12);
        int firstPatientAge = 20;
        int secondPatientAge = 8;

        System.out.println("Age " + firstPatientAge + " for " + medicine.medicineName + ": "
                + medicine.checkEligibility(firstPatientAge));
        System.out.println("Age " + secondPatientAge + " for " + medicine.medicineName + ": "
                + medicine.checkEligibility(secondPatientAge));
    }
}