package org.example.javaBasicCodes;

public class OOPConcepts {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends OOPConcepts {
    void bark() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        OOPConcepts animal = new OOPConcepts();
        animal.sound(); // Calls the method from the parent class

        Dog dog = new Dog();
        dog.sound(); // Calls the method from the parent class
        dog.bark();  // Calls the method from the Dog class
    }

}
