// Base class
class Person {
    // Method to be overridden
    public void occupation() {
        System.out.println("Occupation is unspecified.");
    }
}

// Derived class
class Engineer extends Person {
    // Overriding the occupation method
    @Override
    public void occupation() {
        System.out.println("Occupation is Engineer.");
    }
}

 class Main {
    public static void main(String[] args) {
        // Create an instance of the base class
        Person person = new Person();
        person.occupation(); // Output: Occupation is unspecified.

        // Create an instance of the derived class
        Engineer engineer = new Engineer();
        engineer.occupation(); // Output: Occupation is Engineer.

        // Demonstrating polymorphism
        Person personEngineer = new Engineer();
        personEngineer.occupation(); // Output: Occupation is Engineer.
    }
}
