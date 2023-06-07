//Rosita Nuno
//In Class Assignment 
/*Output:
The maximum of 3 and 4 is 4
The maximum of 3.0 and 5.4 is 5.4
The maximum of 3.0, 5.4 and 10.14 is 10.14
 */

public class maxMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Make print statements for each 
		
		
		System.out.println("The maximum of 3 and 4 is " +  max(3, 4));
		
		System.out.println("The maximum of 3.0 and 5.4 is " +  max(3.0, 5.4));
		
		System.out.println("The maximum of 3.0, 5.4 and 10.14 is " + max(3.0, 5.4, 10.14));
		
	}
	
	//Make method for int of two variables 
	
	public static int max(int s1, int s2)
	
	{
		if( s1 > s2 )
			return s1;
		else
			return s2;
	}
	
	//Make method for double of two variables 
	
	public static double max(double s1, double s2)
	{
		if(s1 > s2)
			return s1;
		else 
			return s2;
	}
	
	//Make method for double of three variables 
	
	public static double max(double s1, double s2, double s3)
	{
		return max(max(s1,s2),s3);
		
	}
	

}
