# OOPS Lab Sheet 05 - Classes, Objects, and Encapsulation

This folder contains twenty beginner-friendly Java programs. Each question has its own package so repeated class names such as `Medicine`, `Patient`, and `PatientMain` do not conflict. Each program can be compiled together and run independently.

## Questions

1. `question01/StudentMain.java` - A no-argument constructor initializes a student record.
2. `question02/MedicineMain.java` - Parameterized constructors initialize two medicines using `this`.
3. `question03/PharmacyMain.java` - Pharmacy objects share a static object count.
4. `question04/PatientMain.java` - A manager loops through an array of five patient objects.
5. `question05/EligibilityMain.java` - A medicine method returns patient age eligibility.
6. `question06/MedicineProductMain.java` - Getters and setters provide controlled access to medicine data.
7. `question07/PatientMain.java` - Patient setters validate age and weight updates.
8. `question08/BankAccountMain.java` - Account methods control deposits, withdrawals, and balance.
9. `question09/PublicAccessMain.java` - Public hospital fields are accessed directly.
10. `question10/PrivateAccessMain.java` - Private employee data is accessed through getters.
11. `question11/DefaultAccessMain.java` - Package-private members are accessed within the same package.
12. `question12/ProtectedAccessMain.java` - A pharmacist child accesses protected hospital staff members.
13. `question13/SingleInheritanceMain.java` - Pharmacist inherits employee information.
14. `question14/HierarchicalMain.java` - Doctor and Nurse inherit from Person.
15. `question15/MultilevelMain.java` - Manager inherits through Employee from Person.
16. `question16/MedicalStaffMain.java` - Doctor and Pharmacist use protected parent data and private role data.
17. `question17/InheritanceConceptMain.java` - Comments explain multiple and hybrid inheritance in Java.
18. `question18/ShapeMain.java` - A manager processes Circle and Rectangle objects in a Shape array.
19. `question19/HospitalStaffMain.java` - An array-based hospital staff system combines inheritance and static data.
20. `question20/PharmacyEmployeeMain.java` - A pharmacy employee manager combines encapsulation and inheritance.

## Compile and Run

Open PowerShell in this folder and compile all programs into `out`:

```powershell
javac -d out (Get-ChildItem -Recurse -Filter *.java).FullName
```

Run a program using its package and class name:

```powershell
java -cp out labsheet05.question01.StudentMain
java -cp out labsheet05.question10.PrivateAccessMain
java -cp out labsheet05.question20.PharmacyEmployeeMain
```