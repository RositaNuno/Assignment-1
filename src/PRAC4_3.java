//Rosita Nuno

//Practice 4 Problem 3
/*
*Output
Enter an integer: 12 -6 -2 4 5 10 0
Number of positive integers: 4
Number of negative integers: 2
The sum of integers is: 23
The average of integers is: 3.8333333
 */
import java.util.Scanner;
public class PRAC4_3 {

	public static void main(String[] args) {
		
		//Create scanner object 
		
		Scanner scnr = new Scanner(System.in);
		
		//Ask user to type numbers 
		
        System.out.print("Enter an integer: ");
        
        //Declare variables 
        
        int sum = 0;
        int positive = 0;
        int negative = 0;
        int n;
        
        //Create for loop to make loop stop when user inputs zero 
        
        for (int i = 0; ;i++)
        {
            n = scnr.nextInt();
            
            //Create scanner object 
            //Make an if statement for all the different input possibilities
            
            if(n==0)
              break;
            sum += n;
            if(n>0)
              positive++;
            else
              negative++;
        }
        
        //Print the output
        
        System.out.println("Number of positive integers: " + positive);
        System.out.println("Number of negative integers: " + negative);
        System.out.println("The sum of integers is: "+ sum);
        System.out.println("The average of integers is: "+(float)sum/(positive+negative));
        
        //Close scanner object 
        
        scnr.close();
        

	}

}
