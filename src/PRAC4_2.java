//Rosita Nuno


//Practice 4 Problem 2 
/*
 * Output
What is 28 + 21 ? 49
You are correct

What is 51 + 40 ? 91
You are correct

What is 83 + 61 ? 12
Your answer is wrong
Your correct answer is 144

What is 64 + 6 ? 70
You are correct

What is 26 + 38 ? 62
Your answer is wrong
Your correct answer is 64

What is 29 + 12 ? 23
Your answer is wrong
Your correct answer is 41

What is 82 + 84 ? 166
You are correct

What is 47 + 84 ? 131
You are correct

What is 7 + 91 ? 98
You are correct

What is 59 + 28 ? 2
Your answer is wrong
Your correct answer is 87
 * 
 */

import java.util.Random;
import java.util.Scanner;
public class PRAC4_2 {

	public static void main(String[] args) {
		
		//Create scanner object
		
		Scanner scnr = new Scanner(System.in);
		
		//Generate two random numbers between 0-100
		
		Random rand = new Random();
		
		//Declare variables 
		//Make a while loop to rum ten times 
		
		int count = 0;
		while(count < 10) {  
		int a = rand.nextInt(101);
		int b = rand.nextInt(101);
		
		//Calculate the sum of the two numbers 
		
		int sum = a+b;
		
		//Write a count function to make sure the loops runs ten times
		
		count++;
		
		//Print the two random numbers 
		//Ask user to guess the sum 
		
		System.out.print("What is " + a + " + " + b + " ? ");
		
		//Run it into the scanner object 
		
		int guess = scnr.nextInt();
		
		//Create a if statement for each possibilities 
		  
		if(guess == sum){
			
		System.out.println("You are correct");
		System.out.println();
		}
		
		else{
		System.out.println("Your answer is wrong");
		System.out.println("Your correct answer is " + sum);
		System.out.println();
		
		}
	}
		//Close the scanner object 
		
		scnr.close();
}
	
}

