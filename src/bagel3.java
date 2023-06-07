//Rosita Nuno
//In class 3 Assignment
import java.util.Scanner;
public class bagel3 
{
	public static void main(String[] args) {
//Declare variables 		
		final double EVERY_BAGEL_COST = 1.99;
		final double BLUE_BAGEL_COST = 1.99;
		final double GARLIC_BAGEL_COST = 1.99;
		final double CREAM_CHEESE_COST = 2.99;
		final double COFFEE_COST = 3.99;
		
// Create a Scanner object to read keyboard input.
	    Scanner scnr = new Scanner(System.in);
		char choice = ' ';
		String selectChoices; // choice for the 5 items
//Declare variables 
		
	      int numItem = 0; // number of items of a choice
	      double total_charges = 0.0; //total cost 
	      double charges_every = 0.0;
	      double charges_blueberry = 0.0;
	      double charges_cream = 0.0;
	      double charges_coffee = 0.0;
	      double charges_garlic = 0.0;
//Create do function	      
	      	    
		do 
		{
//Print menu 
	      System.out.println("Please pick one item from the menu:");
	      System.out.println("Enter A for Everything Bagel");
	      System.out.println("Enter B for Blueberry Bagel");
	      System.out.println("Enter C for Garlic Bagel");
	      System.out.println("Enter D for creme cheese");
	      System.out.println("Enter E for coffee");
	      System.out.println("Enter F for quit");
//Create scanner object  
	      
	      selectChoices = scnr.next();
	      
//Make everything into upper case 
	      
	      choice = Character.toUpperCase(selectChoices.charAt(0)); 
	      
//Create while loop for choices 
	      
	      while((choice < 'A') || (choice > 'F'))
	    	  
	      {
	    	  System.out.println("Please enter a correct choice.");
	    	  System.out.println("Enter a choice between A to F");
	    	  selectChoices = scnr.next();
	    	  choice = Character.toUpperCase(selectChoices.charAt(0));  
	      }
	      
//Create a switch case for each cases 	      
	      
	      switch(choice)
	      
	      {
	      
//Make case A that evaluates for every bagel cost 
	
	      case 'A':
	    	  
	    	  System.out.println("The value of choice is " + choice);
	    	  System.out.println("Enter how many of the item you need: ");
	    	  numItem = scnr.nextInt();
	    	  
	    	  charges_every = numItem *EVERY_BAGEL_COST;
	    	  System.out.println("Your current total amount is: " + charges_every + "\n");
	    	  break;

//Make case B that evaluates blueberry bagel cost 	    	  
	    	  
	    	  
	      case 'B':
	    	  
	    	  charges_blueberry = numItem * BLUE_BAGEL_COST;
	    	  System.out.println("Your current total amount is:  " + charges_every + "\n");
	    	  break;
	    	  
//Make case C that evaluates garlic bagel cost 
	    	  
	      case 'C':
	    	  
	    	  charges_garlic = numItem * GARLIC_BAGEL_COST;
	    	  System.out.println("Your current total amount is: " + charges_every + "\n");
	    	  break;
	    	  
//Make case D that evaluates cream cheese cost 	    	  
	    	  
	      case 'D':
	    	  
	    	  charges_cream = numItem * CREAM_CHEESE_COST;
	    	  System.out.println("Your current total amount is: " + charges_every + "\n");
	    	  break;
	    	  
//Make case E that evaluates coffee cost 	    	  
	    	  
	      case 'E':
	    	  
	    	  charges_coffee = numItem * COFFEE_COST;
	    	  System.out.println("Your current total amount is: " + charges_every + "\n");
	    	  break;
	    	  
	      }		
//Make a while function for everything picked other than A-F		
		
	}while(choice != 'F');
	
	total_charges = charges_every + charges_coffee
			+ charges_cream + charges_blueberry + charges_garlic;
	
//Print the total cost of the items 	
		
	System.out.println("\nTotal charges are: $" + total_charges);
	
			     
//Close scanner function 
	
	      scnr.close();
	}
}
	      
		
