package com.gla.EmployeeManagementSystem;
class Main {
    public static void main(String[] args) {
        Employee e1 = new Manager("Raj", 101, 80000, 5);
        Employee e2 = new Developer("Aman", 102, 60000, "Java");
        Employee e3 = new Intern("Riya", 103, 20000, "ABC College");

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
