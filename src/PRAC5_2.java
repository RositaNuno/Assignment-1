//Rosita Nuno
//Practice 5 Problem 2 
/*
 * Output*
Enter Quarters: 9
The value of is: 2.25
 */
//Import scanner object 
import java.util.Scanner;
public class PRAC5_2 {
	
	//Make a main method 
	
	public static void main(String[] args) {
		
			   //Declare variables 
		
		       double numberOfDollars = quarters_to_dollars(7);
		       
		       //Print the output
		       
		       System.out.println("The value of is: " +numberOfDollars);
		      
		   }
		   
		   //Make a method for calculation 
	
		   public static double quarters_to_dollars(int numberOfQuarters){
			   
			   //Call scanner object 
			   
			   Scanner scnr = new Scanner(System.in);
			   
			   //Ask user for number of quarters
			   
			   System.out.print("Enter Quarters: ");
			   
			   //Call to the scanner object 
			   
			   numberOfQuarters = scnr.nextInt();
			   
			   //Close the scanner object
			   
			   scnr.close();
		       
			   //Declare variables 
			   
		       double numberOfDollars;
		       
		       //Calculate quarters to dollars 
		              
		       numberOfDollars=(double)(numberOfQuarters)/4.0;
		       
		       //Return the number of dollars 
		      
		       return numberOfDollars;
		             
		      
		  
	}
		   

}
