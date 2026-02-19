package com.gla.LibraryManagement;
class Author extends Book {
    String authorName;
    String bio;

    Author(String title, int publicationYear, String authorName, String bio) {
        super(title, publicationYear);
        this.authorName = authorName;
        this.bio = bio;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Year: " + publicationYear);
        System.out.println("Author: " + authorName);
        System.out.println("Bio: " + bio);
    }
}
