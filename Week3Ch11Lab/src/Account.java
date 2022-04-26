/** 
 * Description: Followed demo video, created George and followed instructions
 * Created by: Jacob Osbourne
 * Date: 2/5/2022
 * Version:1.0
 */


class Account {
	private int id;
	private double balance;
	private static double annualInterestRate;
	private java.util.Date dateCreated;
	private String name;
	java.util.ArrayList transactions = new java.util.ArrayList();
	
	public Account() {
		dateCreated = new java.util.Date();
	}
	
	public Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
		dateCreated = new java.util.Date();
	}
	
	public Account(int newId, double newAnnualInterestRate, double newBalance, String name ) {
		id = newId;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
		this.name = name;
		dateCreated = new java.util.Date();
	}
	
	public int getId() {
		return this.id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setId(int newId) {
		id = newId;
	}
	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public static void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	
	public double getMonthlyInterest() {
		return balance * (annualInterestRate / 1200);
	}
	
	public java.util.Date getDateCreated() {
		return dateCreated;
	} 
	
	public void withdraw(double amount) {
		balance -= amount;
		transactions.add(new Transaction('W', amount, balance, ""));
	}
	
	public void deposit(double amount) {
		balance += amount;
		transactions.add(new Transaction('D', amount, balance, ""));
	}
	
	public static void main(String[] args) {
		Account acc = new Account(1122, 1.5, 1000, "George");
		acc.deposit(30);
		acc.deposit(40);
		acc.deposit(50);
		
		acc.withdraw(5);
		acc.withdraw(4);
		acc.withdraw(2);
		
		System.out.println("Name: " + acc.getName());
		System.out.println("Annual Interest Rate: " + acc.getAnnualInterestRate());
		System.out.println("Balance: " + acc.getBalance());
		
		System.out.printf("%-35s%-15s%-15s%-15s\n", "Date", "Type", "Amount", "Balance");
		
		java.util.ArrayList list = acc.getTransactions();
		
		for(int i=0; i < list.size(); i++) {
			Transaction t = (Transaction) list.get(i);
			System.out.printf("%-35s%-15s%-15s%-15s\n", t.getDate(), t.getType(), t.getAmount(), t.getBalance());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public java.util.ArrayList getTransactions() {
		return transactions;
	}

	public void setTransactions(java.util.ArrayList transactions) {
		this.transactions = transactions;
	}
}
