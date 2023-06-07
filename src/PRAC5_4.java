//Rosita Nuno
//Practice 5 Problem 4
/*
 *Output*
Enter the item's wholesale cost: 
7
Enter the item's markup percantage: 
50
The item's retail price is $10.5

 */
//Import scanner		
import java.util.Scanner;
public class PRAC5_4 {
	
	//Make method to calculate 
	
	public static void main(String[] args) {
		
		//Call scanner object 
		
		Scanner scnr =new Scanner(System.in);
		
		//Ask user for item cost

		System.out.println("Enter the item's wholesale cost: ");
		
		//Call to scanner

		double item_cost = scnr.nextDouble();
		
		//Ask user for percentage

		System.out.println("Enter the item's markup percantage: ");
		
		//Call to scanner 

		double percent = scnr.nextDouble();
		
		//Calculate the percentage 

		double t = item_cost *(percent/100);
		
		//Calculate retail price 

		double retail_price= item_cost + t;
		
		//Print the output 

		System.out.println("The item's retail price is $" + retail_price);
		
		//Close scanner object 
		
		scnr.close();

	}

}
