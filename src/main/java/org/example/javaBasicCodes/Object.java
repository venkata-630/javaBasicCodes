package org.example.javaBasicCodes;

public class Object {
    String name = "Venkata";
    int age = 22;

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Object obj = new Object();
        obj.display();
    }
}
