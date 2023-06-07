//Rosita Nuno 
//In Class Assignment 

import java.util.Scanner;

public class bagel 
{

	public static void main(String[] args)
	{
		
		final double EVERY_BAGEL_COST = 1.99;
		final double BLUE_BAGEL_COST = 1.99;
		final double GARLIC_BAGEL_COST = 1.99;
		final double CREAM_CHEESE_COST = 2.99;
		final double COFFEE_COST = 3.99;
		
		// Create a Scanner object to read keyboard input.
	      Scanner scnr = new Scanner(System.in);
		
		String choice; // choice for the 5 items
	     
	      double total = 0; // total cost
	      int numItem = 0; // number of items of a choice
		
		

	      System.out.println("Please pick one item from the menu:");
	      System.out.println("Enter A for Everything Bagel");
	      System.out.println("Enter B for Blueberry Bagel");
	      System.out.println("Enter C for Garlic Bagel");
	      System.out.println("Enter D for creme cheese");
	      System.out.println("Enter E for coffee");
	      System.out.println("Enter F for quit");
	      
	      choice = scnr.nextLine();
	      choice = choice.toUpperCase();
	      //char choiceChar = choice.charAt(0);
	      System.out.println("The value of choice is " + choice);
	      System.out.println("Enter how many of the item you need: ");
	      numItem = scnr.nextInt();
	      
	      
	      if( choice.equals("A"))
	    	  
	      {
	    	  total = EVERY_BAGEL_COST * numItem; 
	    	  
	      }
	      
	      else if( choice.equals("B"))
	    	  
	      {
	    	  total = BLUE_BAGEL_COST * numItem; 
	    	  
	      }
	      
	      else if(choice.equals("C"))
	    	  
	      {
	    	total = GARLIC_BAGEL_COST * numItem;
	    	
	    	
	      }
	      
	      else if(choice.equals("D"))
	    	  
	      {
	    	  total = CREAM_CHEESE_COST * numItem;
	    	
	    	  
	      }
	      
	      else if(choice.equals("E"))
	    	  
	      {
	    	  total = COFFEE_COST * numItem;
	    	  
	      }
	      
	      else
	    	  
	      {
	    	  System.out.println("Invalid choice");
	    	  
	      }
	      
	      System.out.println("The total cost is: " + total); 
	      
	      scnr.close();
	      

	}

}
