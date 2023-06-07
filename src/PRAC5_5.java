//Rosita Nuno
//Practice 5 Problem 5 
/*
 *Output
Enter circle's diameter (inches): 12.3
Circle area is  118.82288800462503
Enter circle's diameter (inches): 13
Circle area is  132.7322894625
Enter circle's diameter (inches): 14.8
Circle area is  172.03361351400002
Enter circle's diameter (inches): 2
Circle area is  3.14159265
Enter circle's diameter (inches): 14.78
Circle area is  171.56897196106502
 */
//Import scanner 
import java.util.Scanner;
public class PRAC5_5 {
	
	//Make main method 

	public static void main(String[] args) {
		
		//Call scanner object
		
		Scanner scnr = new Scanner(System.in);
		
		//Make a for loop 

		for(int i=0;i<5;i++)

		{
			
		//Ask user for the circle's diameter 	

		System.out.print("Enter circle's diameter (inches):");
		
		//Call to scanner

		double diameter = scnr.nextDouble();  
		
		//Calculate area 

		double area = calcCircleArea(diameter/2);
		
		//Print the area of circle 

		System.out.println("Circle area is " + area); 
		
		}  

		}
	
		//Make a method for circle area 

		static double calcCircleArea(double r)

		{
			
		//Return calculation

		return (22*r*r)/7;

		
	}

}
