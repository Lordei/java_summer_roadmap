package day03;

public class BankAccount {
    private String ownerName;
    private double balance;

    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else
        System.out.println("deposit amount must be more than 0!");
    }

    public void withdraw(double amount) {
        if ( amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        } else
        System.out.println("withdraw amount must be more than 0 and less than what in ur account");
    }
    @Override
    public String toString() {
        return "the owner :" + ownerName + " has in his account : " + balance;
    }
}

