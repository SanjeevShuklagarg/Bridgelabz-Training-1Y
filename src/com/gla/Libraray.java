package com.gla;

public class Libraray {
    int quantity;
    private Admin admin;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    LibraryRepositery libraryRepositery = new LibraryRepositery();

}
