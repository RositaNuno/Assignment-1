//Rosita Nuno
//Practice 5 Problem 6
/*
 *Output
Enter the rectangle's length: 2.35
Enter the rectangle's Width: 4.678
The area of the rectangle of length 2.35 and width 4.678 is 10.9933.
 */
//Import scanner
import java.util.Scanner;
public class PRAC5_6 {

		 public static double getLength(){
			  
			  //Declare variable
			  
			    double length;
			    
			  //Call to scanner   
			    
			    Scanner scnr = new Scanner(System.in);
			    
			  //Ask user for length 
			    
			    System.out.print("Enter the rectangle's length: ");
			    
			  //Call to scanner object   
			    
			    length = scnr.nextDouble();
			    
			  //Return length 
			    
			    return length;
			  }

		      //Make method for width 
		  
			  public static double getWidth(){
				  
			  //Declare variable
				  
			    double width;
			    
			  //Call scanner 
			    
			    Scanner scnr = new Scanner(System.in);
			    
			  //Ask user for width
			    
			    System.out.print("Enter the rectangle's width: ");
			    
			  //Call to scanner object 
			    
			    width = scnr.nextDouble();
			    
			  //Return width 
			    
			    return width;
			  }
			  
			  //Make method for area 

			  public static double getArea(double l, double w){
				 
			  //Calculate area and return
				  
			    return l * w;
			  }
			  
			  //Make method to display area 

			  public static void main(String args[]) {
				
			  //Declare variables   
				  
			    double length, width;
			    
			    length = getLength();
			    
			    width = getWidth();
			    
			  //Print area
			    
			  System.out.println("The area of the rectangle of length " +length+ " and width "+width+ " is " +getArea(length,width));

	}

}
