
public class CheckingAccount extends BankAccount {
//	Has an interest rate attribute
	protected double interestRate;
//	Allows overdraft withdrawals and charges a $30 fee
	public CheckingAccount() {
		super();
		this.interestRate = 0;
	}
//	Methods:
	public void setInterestRate(double rate) {
		this.interestRate = rate;
	}
//
//	processWithdrawal() - will display a negative balance that includes a $30 overdraft fee and denotes that a fee has been accessed
	public void processWithdrawal(double withdrawal) {
		if (this.balance - withdrawal < 0) {
			super.withdrawal(withdrawal + 30.0);  // go thru with withdrawal adding 30 for the overdraft charge
			System.out.println("30 dollar overdraft fee charged.");
		}  else {
			super.withdrawal(withdrawal);
		}
	}
//	displayAccount() - should display all superclass attributes and provides an additional interest rate
	public void displayAccount() {
		System.out.println(this.firstName + " " + this.lastName + "'s Checking Account");
		System.out.println("Account ID: " + this.accountID);
		System.out.println("Balance: $" + this.balance);
		System.out.println("Interest Rate: " + interestRate);
	}
}
