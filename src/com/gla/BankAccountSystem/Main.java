package com.gla.BankAccountSystem;
class Main {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("A101", 50000, 5.5);
        CheckingAccount c = new CheckingAccount("A102", 30000, 10000);
        FixedDepositAccount f = new FixedDepositAccount("A103", 100000, 12);

        s.displayAccountType();
        c.displayAccountType();
        f.displayAccountType();
    }
}
