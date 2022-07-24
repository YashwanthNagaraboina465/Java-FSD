package Practise2ndAssisted8;

public class EncapsulationBankAccountTest {
	
	public static void main(String[] args) {
		
	
	//BankAccount a = new BankAccount(4);
	BankAccount acc = new BankAccount(10000);
	acc.setAccountName("XYZ");
	acc.setAccountNumber(-2);
	acc.depositMoney(3000);
	acc.withdrawMoney(4000);
	acc.printDetails();
	
	
	}

	}


