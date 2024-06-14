
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
		System.out.println("HI");
		if (this.balance - withdrawal < 0) {
			super.withdrawal(withdrawal);  // go thru with withdrawal
			this.balance = this.balance - 30.00; // subtract extra 30 for overdraft
			System.out.println("30 dollar overdraft fee charged.  Balance: " + this.balance);
		}  else {
			super.withdrawal(withdrawal);
		}
	}
//	displayAccount() - should display all superclass attributes and provides an additional interest rate
	public void displayAccount() {
		super.accountSummary();
		System.out.println("Interest Rate: " + interestRate);
	}
}
