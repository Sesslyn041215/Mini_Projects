package ATM.Machine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Launch {
	public static void main(String[] args) throws Exception {
		
		Map<Integer, Integer> atm = new HashMap<>();
		atm.put(123456789, 1234);
		atm.put(987654321, 5678);
		atm.put(111222333, 4321);
		atm.put(444555666, 7890);
		atm.put(777888999, 2468);
		
		Scanner sc = new Scanner(System.in);
		
		ATMOperates op = new ATMOperates();
		System.out.println("Welcome to our ATM");
		System.out.print("Enter the ATM number: ");
		int atmNumberUser = sc.nextInt();
		 
		System.out.print("Enter Pin: ");
		int atmPinUser = sc.nextInt();
		
		if (atm.containsKey(atmNumberUser) && atm.get(atmNumberUser) == atmPinUser) {
			
			while (true) {
				System.out.println("1.View Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View MiniStatement\n5.Exit");
				System.out.print ("Enter Choice : ");
				int ch = sc.nextInt();
				
				if (ch == 1) {
					op.viewBalance();
				} 
				
				else if (ch == 2) {
					System.out.print("Enter the amount : ");
					int withdraw = sc.nextInt();
					op.withDrawAmount((double)withdraw);
				} 
				
				else if (ch == 3) {
					System.out.print("Enter the amount to deposit :");
					int deposit = sc.nextInt();
					op.depositAmount((double)deposit);
				} 
				else if (ch == 4) {
                   op.viewMiniStatement();
				} 
				else if (ch == 5) {
					System.out.println("Collect your ATM Card\nThank You for using our ATM Machine.");
					return;
				}
			}

		} 
		
		else {
			System.out.println("Incorrect ATM number or PIN.");
			return;
		}

		
	}
}
