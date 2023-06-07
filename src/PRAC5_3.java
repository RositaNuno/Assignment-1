//Rosita Nuno
//Practice 5 Problem 3
/*
 *Output*
Enter the rectangle's length: 10
Enter the rectangle's width: 5
Length: 10.0
Width: 5.0
Area: 50.0
Perimeter: 30.0
 */
//Import scanner object 
import java.util.Scanner;
public class PRAC5_3 {

		//Make method to get length
	
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
			  
			  //Make method for perimeter 
			  
			  public static double getPerimeter(double l, double w){
				  
			  //Calculate perimeter and return 
				  
				  return l+l+w+w;
			  }
			  
			  //Make method to display length and width 

			  public static void displayData(double l, double w){
				  
			  //Print length and width   
				  
			    System.out.println("Length: "+ l);
			    System.out.println("Width: "+ w);
			  }
			  
			  //Make method to display area and perimeter 

			  public static void main(String args[]) {
				
			  //Declare variables   
				  
			    double length, width;
			    
			    length = getLength();
			    
			    width = getWidth();
			    
			    displayData(length,width);
			    
			  //Print area and perimeter 
			    
			    System.out.println("Area: "+getArea(length,width));
			    
			    System.out.println("Perimeter: "+ getPerimeter(length,width));

	}

}
