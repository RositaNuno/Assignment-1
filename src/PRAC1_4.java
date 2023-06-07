//Rosita Nuno
//Practice 1 Problem 4 
import java.util.Scanner;

public class PRAC1_4 {

	public static void main(String[] args) {
		//declare variables 
		double weight, height, bmi;
		final int factor = 703;
		
		Scanner scnr = new Scanner(System.in);
		//Ask user for height 
		System.out.println("Enter height in inches: ");
		height = scnr.nextDouble();
		//Ask user for weight 
		System.out.println("Enter weight in lbs: ");
		weight = scnr.nextDouble();
		//calculate 
		bmi = weight / height * factor;
		//print results 
		System.out.println("BMI: " + bmi);
		scnr.close();
		
	}

}
