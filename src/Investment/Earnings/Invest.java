package Investment.Earnings;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Invest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your buying price per share: ");
		double buyingPrice = sc.nextDouble();
		int day = 1;
		double closingPrice; 
		DecimalFormat df = new DecimalFormat("0.00");
		
		while(true) {
			
			System.out.print("Enter the closing price for day " + day + " (any negative value to leave) : ");
			closingPrice = sc.nextDouble();
			
			if(closingPrice < 0.0) break;
			
			double earnings = closingPrice - buyingPrice;
			
			if(earnings > 0) {
				System.out.println("After day: " + day + " the amount you earned " + df.format(earnings) + " per share.");
			}
			
			else if(earnings < 0.0) {
				  System.out.println("After day " + day + ", the amount you lost per share: " + df.format(Math.abs(earnings)));
            } 
			
			else {
				System.out.println("After day: " + day + " , you have no earnings per share.");
			}
			day++;	
		}
		sc.close();
	}

}
