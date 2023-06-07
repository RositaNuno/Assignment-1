//Rosita Nuno
//Assignment 4
/*
 * Output *
 SAMPLE 1:
Enter Password: My password18
Invalid Password

 SAMPLE 2:
Enter Password: pass18
Invalid Password

 SAMPLE 3:
Enter Password: password
Invalid Password

 SAMPLE 4:
Enter Password: password18
Valid Password

 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ASSIGNMENT_4 {
	
	//Make a main method 

	public static void main(String[] args) {
		
		//Create scanner object 
		
		Scanner scnr = new Scanner(System.in);
		
		//Ask user to enter password 
		
        System.out.print("Enter Password: " );
        
        //Take input into scanner object
        
        String password = scnr.nextLine();
        
        //Make a if statement to identify what kind of password it is
        
        if(AtLeast8(password) && LetterOrDigit(password) && AtLeast2Digits(password))
        	
        	//Print output as valid 
	
            System.out.println("Valid Password");
        
        //Make an else statement for invalid password 
        
        else
        	
        	//Print output as invalid 
        	
            System.out.println("Invalid Password");
        
        //Close the scanner object 
        
        scnr.close();
        
    }
	
	//Make a method for a string that's at least 8 letters 
	
	 public static boolean AtLeast8(String p){
		 
	        //Make a return statement to check the string as not null
		   //And the string has at least 8 characters
		 
	        return (p!=null && p.length() >= 8)? true: false;
	    }
	 
	 //Make method to check the string has only letters and numbers 
	 
	 public static boolean LetterOrDigit(String p){
		 
	        //Check if it is a letter or number using pattern
		 
	        Pattern PasswordPattern = Pattern.compile("^[a-zA-Z0-9]*$");
	        
	        //Check using matcher 
	        
	        Matcher Matcher = PasswordPattern.matcher(p);
	        
	        //Create if statement to check if the pattern is true or false 
	        
	        if(Matcher.find()){
	        	
	            return true;
	        }
	        
	        else
	        	
	            return false;
	}
	 
	 //Create a method to check if string has at least 2 digits 
	 
	 public static boolean AtLeast2Digits(String p){
		 
	        // Check if string has 2 digits 
		 
	        Pattern PasswordPattern = Pattern.compile("[0-9]{2,}");
	        
	        //Check using matcher 
	        
	        Matcher Matcher = PasswordPattern.matcher(p);
	        
	        //Create if statement to check if pattern is true or false 
	        
	        if(Matcher.find()){
	        
	            return true;
	            
	        }
	        
	        else
	        	
	            return false;
	          
	 }
}

