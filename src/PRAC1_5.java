//Rosita Nuno
//Practice 1 Problem 5 
import java.util.Scanner;

public class PRAC1_5 {

	public static void main(String[] args) {
		//declare 
		double radius, length, area, volume;
		//call scanner 
		Scanner scnr = new Scanner(System.in);
		//ask user for radius 
		System.out.println("Enter radius: ");
		radius = scnr.nextDouble();
		//ask user for length 
		System.out.println("Enter the length: ");
		length = scnr.nextDouble();
		//calculate 
		area = (radius * radius) * 3.14159;
		volume = area * length;
		//print results 
		System.out.println("Area: " + area);
		System.out.println("Volume: " + volume);
		scnr.close();
		
	}

}
