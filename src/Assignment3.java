//Rosita Nuno
//Assignment 3 Number 1 
/*
Output
Tuition after 1 years is 10500.00
Tuition after 2 years is 11025.00
Tuition after 3 years is 11576.25
Tuition after 4 years is 12155.06
Tuition after 5 years is 12762.82
Tuition after 6 years is 13400.96
Tuition after 7 years is 14071.00
Tuition after 8 years is 14774.55
Tuition after 9 years is 15513.28
Tuition after 10 years is 16288.95
*/
public class Assignment3 {

	public static void main(String[] args) {
		
		//Declare variables as double 
		
		double tuition=10000;
		int years = 1;

		//Create a for loop for the amount of tuition after 10 year
		
		for( int i=0; i<10; i++ ){
			
			//Calculate the tuition by multiplying %5 to the sum
			
			tuition = tuition + tuition * 0.05;
			
			//Print the tuition after each year 
			
			System.out.print("Tuition after " + years + " years is ");
			
			//Use print format to 2 decimal places 
			
			System.out.printf("%.2f", tuition);
			
			//Add the years 
			
			years++;
			
			//Print a new line space 
			
			System.out.println();
		}
	}
}

	
