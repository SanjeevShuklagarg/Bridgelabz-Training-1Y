package com.gla.LibraryManagement;
class Main {
    public static void main(String[] args) {
        Author book1 = new Author(
                "Java Basics",
                2023,
                "Shubh Garg",
                "Java Developer and Trainer"
        );

        book1.displayInfo();
    }
}