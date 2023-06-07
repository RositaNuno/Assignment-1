//Rosita Nuno
//Practice 6 Problem 4
/*
 * Output
The original array is: 1, 23, 43, 54, 4, 34, 2, 5, 7, 9, 57, 32
Enter a number:14
The numbers greater than 14 is: 23 43 54 34 57 32 
 */
//Import scanner object 
import java.util.Scanner;
public class PRAC6_4 {
	
	//Make method for the number greater then the input value 
	
	  public static void LargeNum(int[] arr, int n) {
		  
		  //Print the numbers greater than number 
		  
		  System.out.print("The numbers greater than " + n + " is: " );
		  
		  //Make loop to check what the numbers are 
		  
	        for(int i = 0; i < arr.length; ++i) {
	        	
	            if(arr[i] > n) {
	            	
	                System.out.print(arr[i] + " ");
	            }
	        }
	    }
	  
	//Make main method 

	public static void main(String[] args) {
		
		//Make scanner object
		
		Scanner scnr = new Scanner(System.in);
		
		//Declare variables 
		
        int[] num = {1, 23, 43, 54, 4, 34, 2, 5, 7, 9, 57, 32};
        
        //Print original list 
        
        System.out.println("The original array is: 1, 23, 43, 54, 4, 34, 2, 5, 7, 9, 57, 32");
        
        //Ask user for number 
        
        System.out.print("Enter a number:");
        
        //Call to scanner object 
        
        LargeNum(num, scnr.nextInt());
        
        //Close the scanner object 
        
        scnr.close();

	}

}
