import java.util.Scanner; 

public class GuessNumber {

	public static void main(String[] args) {
		int number = (int)(Math.random()*101);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a number");
		
		int guess = -1;
		
		while (guess != number) {
			System.out.print("\nEnter your guess: ");
			guess = input.nextInt();
			
			
		}

	}

}
