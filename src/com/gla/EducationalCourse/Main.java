package com.gla.EducationalCourse;
class Main {
    public static void main(String[] args) {
        PaidOnlineCourse c1 = new PaidOnlineCourse(
                "Java OOP", 40,
                "Udemy", true,
                5000, 1000
        );

        c1.displayDetails();
    }
}
