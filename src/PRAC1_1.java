//Rosita Nuno
//Practice 1 Problem 1
import java.util.Scanner;
public class PRAC1_1 {

	public static void main(String[] args) {
		//call scanner 
		Scanner scnr = new Scanner(System.in);
		//declare variables
		double stateRate = 0.04;
		double countryRate = 0.02;
		double totalTax;
		double purchaseAmt;
		double totalCost;
		//Ask user 
		System.out.print("Enter the purchase amount: ");
		purchaseAmt = scnr.nextDouble();
		//calculate 
		stateRate = stateRate * purchaseAmt;
		countryRate = countryRate * purchaseAmt;
		totalTax = stateRate + countryRate;
		totalCost = totalTax + purchaseAmt;
		//print results 
		System.out.println("Purchase Amount: $" + purchaseAmt);
		System.out.println("State tax: $" + stateRate);
		System.out.println("Country tax: $" + countryRate);
		System.out.println("Total tax: $" + totalTax);
		System.out.println("Total cost: $" + totalCost);
		
		scnr.close();
		
		
		
		
		

	}

}
