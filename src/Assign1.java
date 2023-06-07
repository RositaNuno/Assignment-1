//Rosita Nuno Assignment 1

public class Assign1 {

	public static void main(String[] args) {
		
		Account account = new Account(1122, 20000);
		
        account.setAnnualInterestRate(4.5);
        
        account.withdraw(2500.0);
        
        account.deposit(3000.0);
        
        System.out.println("Balance: $" + account.getBalance());
        
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
        
        System.out.println("Date Created: " + account.getDateCreated());

    }
}

//Create a class called account 

class Account {
	
	//Create a private int data field named id
	
    private int id = 0;
    
    //Create a private double data field named balance
    
    private double balance = 0.0;
    
    //Create a private double data field named annualInterestRate
    
    private static double AnnualInterestRate = 0.0;
    
    //Create a private date data field named dateCreated
    
    private java.util.Date dateCreated;
    
    //Create a no-arg constructor 

    public Account() {
    	
    	//Create a constructor
    	
        dateCreated = new java.util.Date();
    }
    
    //Create an accessor and mutator methods for id, balance, and annualInterestRate

    public Account(int id, double balance) {
    	
        this();
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return AnnualInterestRate;
    }
    
    //Create accessor and mutator methods for dateCreated

    public String getDateCreated() {
        return this.dateCreated.toString();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double AnnualInterestRate) {
        this.AnnualInterestRate = AnnualInterestRate;
    }
    
    //Create method named getMonthlyInterestRate

    public double getMonthlyInterestRate() {
        return (AnnualInterestRate / 100) / 12 ;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
    
    //Create method named withdraw

    public void withdraw(double amount) {
        this.balance -= amount;
    }
    
    //Create method named deposit

    public void deposit(double amount) {
        this.balance += amount;

	}

}
