package monzoBank;

public class BankAccount {

	private String accountNumber;
	private double accountBalance;

	private String customerName;

	private String email;

	private String phoneNumber;

	public void depositFunds(double depositAmount) {
		accountBalance += depositAmount;
		System.out.println("A Deposit of £" + depositAmount + " has being made into your Account " + "New balance is £"
				+ accountBalance);
	}

	public void withdrawFunds(double withdrawAmount) {

		if (accountBalance - withdrawAmount < 0) {
			System.out.println("Insufficient Account Balance! Your Account Balance is £" + accountBalance);
		} else {
			accountBalance -= withdrawAmount;
			System.out.println("A withdraw of £" + withdrawAmount + " has taken place in your account " + accountNumber
					+ ", New Balance is £" + accountBalance);
		}
	}

	public BankAccount(String accountNumber, double accountBalance, String customerName, String email,
			String phoneNumber) {
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		String st = "";
		st += "Account Number is " + accountNumber + "\n";
		st += "Account Balance is £" + accountBalance + "\n";
		st += "Customer Name is " + customerName + "\n";
		st += "Email: " + email + "\n";
		st += "Phone Number: " + phoneNumber;

		return st;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
