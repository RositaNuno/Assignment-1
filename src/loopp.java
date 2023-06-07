import java.util.Scanner;

public class loopp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		
		String s = scnr.nextLine();
		
		s = s.trim();
		
		int  word = 1;
		
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)== ' ')
			{
				word++;
				
			}
						
		}
		
		System.out.print("The number of words: " + word );
		
		scnr.close();

	}
	
	
	
}
