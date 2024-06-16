
public class Test {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		CheckingAccount ca = new CheckingAccount();
		// Testing BankAccount functions
		ba.deposit(100);
		ba.withdrawal(50);
		ba.setFirstName("Steve");
		ba.setLastName("Dimmit");
		ba.setID(11111);
		System.out.println(ba.getFirstName());
		System.out.println(ba.getLastName());
		System.out.println(ba.getID());
		ba.accountSummary();
		//testing checking account functions
		ca.setFirstName("Joe");
		ca.setLastName("Smith");
		ca.setID(222);
		ca.setInterestRate(0.05);
		ca.deposit(100);
		ca.processWithdrawal(110);
		ca.displayAccount();
	}

}
