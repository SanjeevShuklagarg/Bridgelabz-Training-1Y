package com.gla.BankAccountSystem;
class FixedDepositAccount extends BankAccount {
    int tenure; // months

    FixedDepositAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}
