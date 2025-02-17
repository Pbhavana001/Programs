package OOPS;

import java.util.Scanner;
class BankAccount {
    private double balance;
    public BankAccount(double initialbalance) {
        this.balance = initialbalance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("deposited amount is "+  amount  + "and the final balance is : " + balance);
        }
        else
            System.out.println("Invalid amount");
    }
    public void withdraw(double amount){
        if(amount>0 && amount <= balance)
        {
            balance = balance-amount;
            System.out.println("Remaining balance amount is " + balance);}
            else{
                System.out.println("Insufficient amount");
        }
    }

public static void main(String[] args)
{
    Scanner scanner=new Scanner(System.in);
    System.out.print("Please enter the initial balnce :");
            double initialBalance = scanner.nextDouble();
    BankAccount account = new BankAccount(initialBalance);
System.out.println("Welcome to bank");

    System.out.println("PRESS 1 : Deposit");
    System.out.println("PRESS 2 :Withdraw");
    System.out.println("PRESS 3 : Check Balance");
    System.out.print("Please select ur option above : ");
    int choice =scanner.nextInt();
if(choice==1){
    System.out.print("Please enter the amount:");
    double amount = scanner.nextDouble();
    account.deposit(amount);
}
    if(choice==2) {
        System.out.print("Please enter the amount to withdraw:");
        double amount1 = scanner.nextDouble();
        account.withdraw(amount1);
    }
    if(choice==3) {
        System.out.print("Balance is :" + account.getBalance());;

    }
}}


