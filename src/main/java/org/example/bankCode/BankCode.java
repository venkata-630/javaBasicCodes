package org.example.bankCode;

public class BankCode {

    public  int accountNumber;
    public String accountHolder;
    double balance;

    public BankCode(String gopi, int i, double v) {

    }

    public  void BankAccount(String name, int accNo, double initialBalance) {
        accountHolder=name;
        accountNumber= accNo;
        balance= initialBalance;

    }

    public void showDetails(){
        System.out.println("Account Details");;
        System.out.println("Account Holders:"+ accountHolder);
        System.out.println("AccountNumber:"+ accountNumber);
        System.out.println("Balance:"+ balance);
        System.out.println("========================");
    }

    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Rupees" + amount + "deposited .");

        }else {
            System.out.println("Deposited  amount must be positive.");
        }
    }

    public  void  withdraw (double amount){
        if(amount <=0) {
            System.out.println("withDraw amount must be positive.");

        }else if(amount > balance){
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            balance -= amount;
            System.out.println("Rupees" + amount + "withdrawn successfully.");
        }
    }

    public void checkBalance(){
        System.out.println("Current balance is: " + balance);
    }
}
