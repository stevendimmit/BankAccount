
public class BankAccount {
	protected String firstName;
	protected String lastName;
	protected int accountID;
	protected double balance;
//	constructor():  initialize balance to zero
	public BankAccount() {
		this.firstName = "";
		this.lastName = "";
		this.accountID = -1;
		this.balance = 0;
	}
//	deposit() - will accept a single value double parameter; the parameter value is added to the existing balance
	public void deposit(double deposit) {
		this.balance = deposit + this.balance;
		System.out.println("Deposit Successful");
	}
//	withdrawal() - accepts a single value double dollar amount; the parameter value is subtracted from the existing balance
	public void withdrawal(double withdrawl) {
		this.balance = this.balance - withdrawl;
		System.out.println("Withdrawl Successfull");
	}
//	Setters and getters for firstName, lastName, and accountID
	public void setFirstName(String name) {
		this.firstName = name;
	}
	public void setLastName(String name) {
		this.lastName = name;
	}
	public void setID(int id) {
		this.accountID = id;
	}
	
//getters
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public int getID() {
		return this.accountID;
	}
//	getBalance() getter to return the balance
	public double getBalance() {
		return this.balance;
	}
//	accountSummary() - prints all account information
	public void accountSummary() {
		System.out.println(this.firstName + " " + this.lastName + "'s Bank Account");
		System.out.println("Account ID: " + this.accountID);
		System.out.println("Balance: " + this.balance);
	}
}
