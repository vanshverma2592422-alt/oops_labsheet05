package labsheet05.question17;

public class InheritanceConceptMain {
    public static void main(String[] args) {
        System.out.println("Read the comments in InheritanceConceptMain to learn about multiple and hybrid inheritance.");
    }

    /*
     * Multiple inheritance means inheriting from more than one parent class.
     * Java does not allow this because two parent classes could provide conflicting
     * fields or methods, leaving the child class with an ambiguity to resolve.
     * Invalid Java class declaration: class C extends A, B
     *
     * Hybrid inheritance combines more than one inheritance form, such as
     * hierarchical and multiple inheritance. Java commonly uses interfaces when
     * a class needs multiple or hybrid inheritance of type and behavior.
     * This example intentionally does not create or implement an interface.
     */
}