//Rosita Nuno
//Practice 6 Problem 1
/*
 * Output
Enter number of students: 4
Enter 4 scores: 67 98 86 43
Student 0 score is 67.0 and grade is D
Student 1 score is 98.0 and grade is A
Student 2 score is 86.0 and grade is B
Student 3 score is 43.0 and grade is F
 */
//Import scanner object
import java.util.Scanner;
public class PRAC6_1 {

	public static void main(String[] args) {
		
		//Call scanner object 
		
		Scanner scnr = new Scanner(System.in);
		
		//Ask user for number of students 
		
		System.out.print("Enter the number of students: ");
		
		//Call to scanner object 
		
		int num = scnr.nextInt();
		
		//Declare variables 
		
		int[] scores = new int[num];
		
		//Ask user for scores 
		
		System.out.print("Enter "  + num + " scores: ");
		
		//Make for loop for scores 
		
		for(int i = 0; i < num; i++)
		{
			
			scores[i] = scnr.nextInt();
			
		}
		
		//Declare variable
		
		int best = scores[0];
		
		//Make for loop for scores
		
		for(int i = 1; i < scores.length; i++)
		{
			
			//Make if statement for best scores 
			
			if(scores[i] > best)
			{
			
				best = scores[i];
				
			}
		}
		
		//Make for loop for the output of scores for each student 
		
		for(int i = 0; i < scores.length; i++)
		{
		System.out.print("Student " + i + " score is " + scores[i]
				+ " and grade is ");
		
		//Make if statement for A grade 
		
		if(scores[i] >= best - 10)
			
			System.out.println("A");
		
		//Make if else statement for B grade 
		
		else if(scores[i] >= best - 20)
			
			System.out.println("B");
		
		//Make if else statement for C grade 
		
		else if(scores[i] >= best - 30)
			
			System.out.println("C");
		
		//Make if else statement for D grade 
		
		else if(scores[i] >= best - 40)
			
			System.out.println("D");
		
		//Make else statement for F grade 
		
		else
			
			System.out.println("F");
		
		
		}
	}
}
