package org.example.javaBasicCodes;

public class Constructor {
    String name;
    int id;

    void Employee(String n, int i) {
        name = n;
        id = i;
    }

    void show() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    public static void main(String[] args) {
        Constructor emp = new Constructor();
        emp.Employee("Gopi", 101);
        emp.show();
    }
}
