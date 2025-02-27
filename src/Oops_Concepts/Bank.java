package Oops_Concepts;
class Customer{
    private int customerId;
    private String name;
    public Customer(int Id,String name){
        this.customerId=Id;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getCustomerId() {
        return customerId;
    }
    public void addBankAccount(){

    }
    public void displayCustomerDetails(){
        System.out.println("Customer name : "+ name);
        System.out.println("Customer ID : " + customerId);
    }
}
class BankAccount{
    private String accountName;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountName;
    }

    public BankAccount(String accountName, double balance){
       this.accountName=accountName;
       this.balance=balance;
    }
    public void deposit(double amount){
     balance+=amount;
        System.out.println("Total balance : " + balance );
    }
    public void withdrawal(double amount){
        double RemainingBalance=balance-amount;
        if(balance==0){
            System.out.println("Insufficent amount");
        } else if (amount>balance) {
            System.out.println("Please enter valid amount");
        }
        else{
            System.out.println("Withdrwal amount is : " + amount );
            System.out.println("Reamining Balance is : "+ RemainingBalance);
        }

    }
    public void details(){
        System.out.println("Customer Account :" + accountName);
        System.out.println("Current Balance : " + balance);
    }
}
class Transaction {
    private String transactionId;
    private double amount;
    // private LoacalDateTime timestamp;

    public double getAmount() {
        return amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public Transaction(String Id, double amount) {
        this.transactionId = Id;
        this.amount = amount;
    }

    public void TransactionDetails() {
        System.out.println("Transcation ID : " + transactionId);
        System.out.println("Amount : " + amount);
    }
}
public class Bank {
    public static void main(String[] args){
Customer details=new Customer(1,"bhavana");
BankAccount account=new BankAccount("Savings",10000.000);
Transaction trans=new Transaction("Withdrwal/Deposit",2000);
details.displayCustomerDetails();
account.details();
account.deposit(2000);
account.withdrawal(1000);
trans.TransactionDetails();

    }
}
