package OOPS;

import java.util.Scanner;
class Bank{
    private String name;
    private int balance;
   public Bank(String name , int balance){
       this.name=name;
       this.balance = balance;
   }
public String getName(){
       return name;
}
public int getBalance(){
       return balance;
}
public void deposit(int amount){
       balance=amount+balance;
          System.out.println("Deposit successful! New balance:" + balance);
       }
public int withdrawals(int amount){
       if(amount>balance){
         System.out.println("Insufficient funds! Your balance is:" + balance);
       }
       else{
           return amount;
       }
    return amount;
}
}public class EncapsulationBank {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter account holder's name :");
        String name=scan.nextLine();
        System.out.print("Enter the initial balance :");
        int balance=scan.nextInt();
        //scan.nextInt();
        Bank details=new Bank(name , balance);
        System.out.println("Banking System Menu :");{
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.println("Choose an option:");
            int number=scan.nextInt();
            switch(number){
                case 1:{
                    System.out.print("Enter deposit amount:");
                int deposit=scan.nextInt();
                details.deposit(deposit);
            }
            break;
                case 2: {
                    System.out.print("Enter withdrawal amount:");
                int withdrawal=scan.nextInt();
                details.withdrawals(withdrawal);
            }
            break;
                case 3:{
                    System.out.print("Current balance:" + details.getBalance());
            }
            break;
                case 4:{
                    System.out.print("Exiting... Thank you for using our banking system!");
                }
        }
        scan.close();

    }}
}
