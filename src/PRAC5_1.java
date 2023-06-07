//Rosita Nuno
//Practice 5 Problem 1
/*
 *Output*
Enter a string: happy
Enter a position: 2
The Character at position 2 of the string 'happy' is p 
 */
//Import scanner object
import java.util.Scanner;
//Make a class
class PRAC5_1 {

		//Make a Main method to print output 
	
		public static void showChar(String string, int position)

	    {

	    //Print the output 

	    System.out.println("The Character at position " + position + " of the string '" + string + "' is " + string.charAt(position));

	    }

	    //Make a method to read the string

	    public static void main(String[] args)

	    {
	    	
	    	//Make a scanner object 

	        Scanner scnr = new Scanner(System.in);

	        //Ask the user for a string 

	        System.out.print("Enter a string: ");

	     
	        //Call to the scanner object

	        String string = scnr.nextLine();
	        
	        //Ask user for the position

	        System.out.print("Enter a position: ");

	        //Call to scanner object

	        int position = scnr.nextInt();

	        //Show the char value

	        showChar( string , position );
	        
	        //Close the scanner object 
	        
	        scnr.close();

	   
	}

}
