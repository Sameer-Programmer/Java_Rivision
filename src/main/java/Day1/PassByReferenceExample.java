package Day1;

class Person {
    String name;
}

public class PassByReferenceExample {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Sameer";

        modifyPerson(p); // A copy of the reference is passed
        System.out.println("After method call: " + p.name); // Output: Shaik
    }

    public static void modifyPerson(Person personRef) {
        personRef.name = "Shaik"; // Modifies the original object through the reference
    }
}

