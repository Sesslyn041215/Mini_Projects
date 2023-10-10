package ATM.Machine;

import java.util.HashMap;
import java.util.Map;

public class ATMOperates implements ATMOperation {

	ATM atm = new ATM();
	Map<Integer, String> mini = new HashMap<>();

	@Override
	public void viewBalance() {

		System.out.println("Available Balance is : " + (int) atm.getBalance());
	}

	@Override
	public void withDrawAmount(double withdrawAmount) throws IllegalArgumentException {
		try {
			if (atm.getBalance() <= 0) {
				System.out.println("Account Balance is zero or less than zero");
				throw new IllegalArgumentException();
			} else if (withdrawAmount > atm.getBalance()) {
				System.out.println("Account Balance is less than " + (int) withdrawAmount);
				throw new IllegalArgumentException();
			} else if (withdrawAmount <= 0) {
				System.out.println("Withdraw Anount is zero or less than zero");
				throw new IllegalArgumentException();
			} else {
				mini.put((int) withdrawAmount, " amount withdrawn.");
				double currentBalance = atm.getBalance();
				double finalBalance = currentBalance - withdrawAmount - 5;
				atm.setBalance(finalBalance);
				System.out.println((int) withdrawAmount + " withdraw successfully\nPlease collect your Cash");
				viewBalance();
			}
		} catch (IllegalArgumentException e) {

		}

	}

	@Override
	public void depositAmount(double depositAmount) throws IllegalArgumentException {
		try {
			if (depositAmount > 0) {
				mini.put((int) depositAmount, " amount deposited.");
				double currentBalance = atm.getBalance();
				double finalBalance = currentBalance + depositAmount;
				atm.setBalance(finalBalance);
				System.out.println((int) depositAmount + " deposited successfully");
			} else {
				System.out.println("Amount cannot be zero or less than zero.");
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {

		}
	}

	@Override
	public void viewMiniStatement() {
      for(Map.Entry<Integer,String> m : mini.entrySet()) {
    	  System.out.println(m.getKey() + m.getValue());
      }
      viewBalance();
	}

}
