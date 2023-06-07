//Import scanner object 
import java.util.Scanner;
public class scores {

	public static void main(String[] args) {
		//Declare variables
		final int NUM_PLAYERS = 5;
		int[] pscores = new int[NUM_PLAYERS];
		//Call Scanner object 
		Scanner scnr = new Scanner(System.in);
		//Declare int variables 
		int num, score = 0;
		//Ask user to enter player number and score 
		System.out.print("Enter the [player #] [Score]:");
		
		num = scnr.nextInt();
		
		while(num >= 0) {
			
			score = scnr.nextInt();
			
			while(score <1 || score > 3)
			{
				System.out.println("The score has to be 1, 2, or 3");
				System.out.println("Enter the right score: ");
				score = scnr.nextInt();
			}
			
			pscores[num]+= score; 
			 
			System.out.print("Enter the [player #] [Score]");
			
			num = scnr.nextInt();
			
		}
		
		for (int i = 0; i < NUM_PLAYERS; i++)
		{
			System.out.println("Player" + i+" "+ pscores[i]);
		}
		
		
		
		

	}

}
