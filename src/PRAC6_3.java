//Rosita Nuno
//Practice 6 Problem 3 
/*
 * Output
Enter the integers between 1 and 100: 
2 3 4 5 7 2 6 3 5 4 8 1 2 4 5 6 98 97 99 56 98 0
1 occurs 1 time
2 occurs 3 time
3 occurs 2 time
4 occurs 3 time
5 occurs 3 time
6 occurs 2 time
7 occurs 1 time
8 occurs 1 time
56 occurs 1 time
97 occurs 1 time
98 occurs 2 time
99 occurs 1 time
 */
import java.util.Scanner;
public class PRAC6_3 {

	public static void main(String[] args) {
		
		//Call scanner object 
		
		Scanner scnr = new Scanner(System.in);
		
		   //Declare variables 
		
	       int a[]=new int[100];
	       
	       int n;
	       
	       //Ask user for numbers between 1 and 100 
	       
	       System.out.println("Enter the integers between 1 and 100: ");
	       
	       //Make a while loop to check numbers 
	       
	       while(true) {
	    	   
	           n=scnr.nextInt();
	           
	           if(n==0) break;
	           
	           a[n]++;
	       }
	       
	       //Make a for loop for each number of occur
	       
	       for(int i=1;i<100;i++) {
	    	   
	           if(a[i]!=0)
	        	   
	               System.out.println(i+" occurs "+a[i]+" time");
	       }

	}

}
