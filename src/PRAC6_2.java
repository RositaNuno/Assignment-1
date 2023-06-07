//Rosita Nuno
//Practice 6 Problem 2
/*
 * Output
Read 10 numbers: 3 6 78 98 12 34 56 78 09 12
The reversal of input is: 12 9 78 56 34 12 98 78 6 3 
 */
//Import scanner object 
import java.util.Scanner;
public class PRAC6_2 {

	public static void main(String[] args) {
		
		//Declare variables 
		
		int a[]=new int[10];
		
	       int i;
	       
	       //Call scanner object 

	       Scanner scnr = new Scanner(System.in);
	       
	       //Ask user for 10 numbers 
	       
	       System.out.print("Read 10 numbers: ");
	       
	       //Make for loop 
	      
	       for(i=0;i<10;i++)
	       {
	
	           a[i]=scnr.nextInt();
	       }
	       
	       //Print the reversal order 

	       System.out.print("The reversal of input is: ");
	       
	       //Read the reversal order 
	       
	       for(i=9;i>=0;i--)
	       {
	           System.out.print(a[i]);
	           System.out.print(" ");
	       }

	}

}
