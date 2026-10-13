package labsheet05.question02;

class Medicine {
    String medicineName;
    String batchNo;
    double price;

    public Medicine(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }

    public void displayMedicine() {
        System.out.println("Medicine: " + medicineName);
        System.out.println("Batch number: " + batchNo);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class MedicineMain {
    public static void main(String[] args) {
        Medicine firstMedicine = new Medicine("Paracetamol", "B101", 25.50);
        Medicine secondMedicine = new Medicine("Vitamin C", "B205", 48.00);

        firstMedicine.displayMedicine();
        secondMedicine.displayMedicine();
    }
}