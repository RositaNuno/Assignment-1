//Rosita Nuno
//Practice 4 Problem 5 
/*
 * Output 
 * The total output is: 82.0
 */
public class PRAC4_5 {

	public static void main(String[] args) {
		
		//Declare variables 
		
		double totalNum = 0.0;
		
		//Create a for loop for the range of 1-30

		for(int i=1,j=30;i<=30 && j>0;i++,j--)

		{
			
		//Calculate the total 

		totalNum = totalNum + (double)(i/j);

		}
		
		//Print the output 

		System.out.println("The total output is: " + totalNum);

	}

}
