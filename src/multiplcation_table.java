//Rosita Nuno
//In Class Assignment
//10-22-2019
public class multiplcation_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create Multiplication Table 
		
		System.out.println("          Multiplication Table");
		
		System.out.print("  ");
		
		//Create a for loop 
		
		for(int j = 1; j <= 10; j++)
			
			System.out.print(" " + j);
		
		//Create the line for the table 
		
		System.out.println("\n-------------------------------------");
		
		//Create the for loop 
		
		for(int i=1; i <= 10; i++)
		{
			System.out.printf("%2d" + " | ", i);
			 for (int j = 1; j <= 10; j++)
			 {
				 System.out.printf("%4d", i * j);
			 }
			 
			 System.out.println();
			 	
		}
		
	}

}
