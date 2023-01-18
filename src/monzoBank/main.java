package monzoBank;

public class main {

	public static void main(String[] args) {

		BankAccount uzosAccount = new BankAccount("656434", 0, "Uzochukwu Umejiofor", "uzo@gmail.com", "0712345678");
		System.out.println(uzosAccount.toString());
		System.out.println();
		uzosAccount.depositFunds(3000);
		uzosAccount.withdrawFunds(4000.0);
		uzosAccount.withdrawFunds(2000.0);
		System.out.println();
		System.out.println(uzosAccount.getAccountBalance());
		System.out.println();
		System.out.println(uzosAccount.toString());

	}

}
