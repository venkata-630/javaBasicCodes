package org.example.bankCode;

public class BankMain {
    public static void main(String[] args) {
        BankCode account = new BankCode("Gopi", 1234567890, 10000.0);

        System.out.println("🚀 Starting Bank Operations...\n");

        System.out.println("👉 Operation 1: Show Account Details");
        account.showDetails();

        System.out.println("👉 Operation 2: Deposit ₹500");
        account.deposit(500);

        System.out.println("👉 Operation 3: Withdraw ₹200");
        account.withdraw(200);

        System.out.println("👉 Operation 4: Withdraw ₹2000");
        account.withdraw(2000);

        System.out.println("👉 Operation 5: Check Balance");
        account.checkBalance();

        System.out.println("👉 Operation 6: Final Account Details");
        account.showDetails();

        System.out.println("👋 Thank you for banking with us!");
    }

}


