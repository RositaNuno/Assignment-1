//Rosita Nuno
//import scanner
//Practice 1 Problem 7 
import java.util.Scanner;
public class PRAC1_7 {

	public static void main(String[] args) {
		//Call scanner 
		Scanner scnr = new Scanner(System.in);
		//Ask user
		System.out.print("Enter the amount to change: ");
		//Declare variables 
		double amount = scnr.nextDouble();
		//Calculate
		int change = (int) (amount*100);
		int twenty = change / 2000;
		if (twenty > 0) {
		change = change % 2000;
		//print 20s
	    System.out.println(twenty + " $20 bill(s)");
		       }
		//print 10s
		       int ten = change / 1000;
		       if (ten > 0) {
		           change = change % 1000;
		           System.out.println(ten + " $10 bill(s)");
		       }
		       
		       //print 5s 

		       int five = change / 500;
		       if (five > 0) {
		           change = change % 500;
		           System.out.println(five + " $5 bill(S)");
		       }
		       
		       //print 1s

		       int one = change / 100;
		       if (one > 0) {
		           change = change % 100;
		           System.out.println(one + " $1 bill(s)");
		       }
		       //print quarters

		       int quarter = change / 25;
		       if (quarter > 0) {
		           change = change % 25;
		           System.out.println(quarter + " quarter coin(s)");
		       }
		       
		       //print dimes

		       int dime = change / 10;
		       if (dime > 0) {
		           change = change % 10;
		           System.out.println(dime + " dime coin(s)");
		       }
		       
		       //print nickles 

		       int nickel = change / 5;
		       if (nickel > 0) {
		           change = change % 5;
		           System.out.println(nickel + " nickel coin(s)");
		       }
		       
		       //print pennies 
		       int pennies = change;
		       if(pennies>0)
		       System.out.println(pennies + " penny coin(s)");
		      
		       scnr.close();

	}

}
