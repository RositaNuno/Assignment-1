//Rosita Nuno
//Assignment 3 Problem 2
/*
Input: 12
Output:
For how many days you will work?
12
Day             Pennies Earned
1               1
2               2
3               4
4               8
5               16
6               32
7               64
8               128
9               256
10               512
11               1024
12               2048

Total pay: $40.95

---------------------------------

Input: 28
Output:
For how many days you will work?
28
Day             Pennies Earned
1               1
2               2
3               4
4               8
5               16
6               32
7               64
8               128
9               256
10               512
11               1024
12               2048
13               4096
14               8192
15               16384
16               32768
17               65536
18               131072
19               262144
20               524288
21               1048576
22               2097152
23               4194304
24               8388608
25               16777216
26               33554432
27               67108864
28               134217728

Total pay: $2684354.55  
 */
import java.util.Scanner;
public class Assignment3Problem2 {
	public static void main(String[] args) {
		
		//Create scanner object 

		Scanner scnr =new Scanner(System.in);
		
		//Declare variables 

		int PenniesEarned = 1;		
		int NumOfDays;
		int i;
		int c = 1;
		double dollars;
		
		//Ask user the number of days that they worked for

		System.out.println("For how many days you will work?");
		
		//Take the input 

		NumOfDays = scnr.nextInt();

		//Create a if statement to validate input 

		if(NumOfDays < 1)

		System.out.println("Invalid number cannot be accepted");
		
		//Create else statement if input is correct 

		else

		{
			
		//Print the Day and Pennies Earned 

		System.out.println("Day             Pennies Earned");

		//Print the first day of pennies earned 

		System.out.println(1 + "               "+PenniesEarned);

		//Create a for loop for the rest of the days

		for(i = 2; i <= NumOfDays; i++)

		{
			
		//Calculate the pennies earned 

		PenniesEarned= 2*PenniesEarned;

		c=c+PenniesEarned;
		
		//Print the pennies earned 

		System.out.println(i +"               "+PenniesEarned);

		}

		//Calculate the total earning in dollars

		dollars = c / 100.0;
		
		//Print new line 
		
		System.out.println();
		
		//Print the total pay in dollars 

		System.out.println("Total pay: $" + dollars);
		
		//Close the scanner object 
		
		scnr.close();

		}

		}
	}


