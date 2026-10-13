package labsheet05.question11;

class Pharmacy {
    // Default/package-private field: accessible inside this package.
    String medicineName = "Paracetamol";
    double price = 25.50;

    // Default/package-private constructor and method: no access keyword.
    Pharmacy() {
    }

    void displayMedicine() {
        System.out.println("Medicine: " + medicineName);
        System.out.println("Price: " + price);
    }
}

public class DefaultAccessMain {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        System.out.println("Direct access: " + pharmacy.medicineName + " costs " + pharmacy.price);
        pharmacy.displayMedicine();
    }
}