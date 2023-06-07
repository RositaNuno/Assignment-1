//Rosita Nuno

//Practice 4 Problem 6
/*
 * Output
Guess a magic number between 0 and 100
Enter your guess: 
20
Your guess is too low

Enter your guess: 
60
Your guess is too high

Enter your guess: 
50
Your guess is too high

Enter your guess: 
45
Your guess is too low

Enter your guess: 
48
Yes, the number is 48
 */
import java.util.Scanner;
public class PRAC4_6 {

	public static void main(String[] args) {
		
		//Call the scanner object 
		
		Scanner scnr =new Scanner(System.in);
		
		//Declare variables 
		
		int guess;
		
		int Num;
		
		//Ask the user to input their guess 

		System.out.print("Guess a magic number between 0 and 100");
		
		//Create the random number range 
		
		Num = (int)(Math.random() * (100-0) + 0); 
		
		//Create a while loop for each possibility 

		while(true)
		{
		//Ask user to input their guess
			
		System.out.println("\nEnter your guess: ");
		
		//Take input to the scanner object 
		
		guess = scnr.nextInt();
		
		//Create if statement for when the number guess is too high 
		
		if(guess > Num){
		
		//Print the output 
			
		System.out.println("Your guess is too high");
		
		}
		
		//Create else if statement for when the guess is too low 
		
		else if(guess < Num){
		
		//Print the output 	
		
		System.out.println("Your guess is too low");
		
		}
		
		//Create else if statement for when user correctly guessed the number 
		
		else if(guess == Num){
		
		//Print the output 
			
		System.out.println("Yes, the number is " + Num);
		
		//Create a break to stop the loop
		
		break;
		}
		}
		
		//Close the scanner object 
		
		scnr.close();

		}
		}




		

