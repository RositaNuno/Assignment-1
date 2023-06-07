//Rosita Nuno

//Practice 4 Problem 6 
/*
 * Output
Enter a String: 
mom
mom is a palindrome

 */
import java.util.Scanner;
class PRAC4_7 {
	
	//Make main method using boolean 
	
	public static boolean palindrome(String str) {
		
		//Create if statement to check for conditions of the string 
		
		if(str.length() == 0 || str.length() == 1)
			
			//Return if the statement is true 
			
            return true;
		
		//Create if statement to check if false to return as false 
		
        if(str.charAt(0) == str.charAt(str.length()-1))
        	
        //Check for the length of the string 
        	
        return palindrome(str.substring(1, str.length()-1));
        
        return false;
    }
	
	//Make method for string 
	
    public static void main(String[]args)
    {  
    	//Create scanner object 
    	
    	Scanner scnr = new Scanner(System.in);
    	
    	//Ask user for string
    	
        System.out.println("Enter a String: ");
        
        //Take it to scanner object 
        
        String string = scnr.nextLine();
        
        //Create a if statement to check the string 
         
        if(palindrome(string))
        	
        	//Print that out is palindrome 
        	
            System.out.println(string + " is a palindrome");
        	
        	//Create else statement when it is not a palindrome
        
        else
            System.out.println(string + " is not a palindrome");
        
        //Close the scanner object 
        
        scnr.close();

	}
}
