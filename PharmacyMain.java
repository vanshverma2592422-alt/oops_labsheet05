package labsheet05.question03;

class Pharmacy {
    String pharmacyName;
    String location;
    static int pharmacyCount = 0;

    public Pharmacy(String pharmacyName, String location) {
        this.pharmacyName = pharmacyName;
        this.location = location;
        pharmacyCount++;
    }

    public void displayPharmacy() {
        System.out.println("Pharmacy: " + pharmacyName);
        System.out.println("Location: " + location);
    }

    public static void displayPharmacyCount() {
        System.out.println("Total pharmacies: " + pharmacyCount);
    }
}

public class PharmacyMain {
    public static void main(String[] args) {
        Pharmacy first = new Pharmacy("HealthCare Pharmacy", "Colombo");
        Pharmacy second = new Pharmacy("City Pharmacy", "Kandy");
        Pharmacy third = new Pharmacy("Family Pharmacy", "Galle");

        first.displayPharmacy();
        second.displayPharmacy();
        third.displayPharmacy();
        Pharmacy.displayPharmacyCount();
    }
}