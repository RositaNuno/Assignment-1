//Rosita Nuno
//Assignment 5
/*
 * Output 
 * Sample 1:
Enter the size for the list1: 6
Enter the values for the list1: 1 2 3 4 5 6
Enter the size for the list2: 5
Enter the values for the list2: 1 2 3 4 5 
The lists are not identical.

Sample 2:
Enter the size for the list1: 5
Enter the values for the list1: 1 2 3 5 7 
Enter the size for the list2: 5
Enter the values for the list2: 1 3 4 6 7 
The lists are not identical.

Sample 3:
Enter the size for the list1: 5
Enter the values for the list1: 1 3 5 7 9 
Enter the size for the list2: 5
Enter the values for the list2: 1 3 5 7 9 
The lists are identical.

 */

//Import the scanner object 
import java.util.Scanner;

class ASSIGN_5 {
	
//Make a main method
public static void main(String[] args) {

	//Declare variables 
	
	int l1,l2;
	
	//Declare arrays
	
	int array1[],array2[];
	
	//Declare boolean variable 
	
	boolean res;
	
	//Create scanner object 
	
	Scanner scnr = new Scanner(System.in);
	
	//Output size of list1 and list2
	
	System.out.print("Enter the size for the list1: ");
	
	//Call scanner 
	
	l1 = scnr.nextInt();
	
	//Ask user for the values of list 1 
	
	System.out.print("Enter the values for the list1: ");
	
	//Call function to read elements 
	
	array1 = getArray(l1);
	
	//Ask user for size of list 2 
	
	System.out.print("Enter the size for the list2: ");
	
	//Call scanner 
	
	l2 = scnr.nextInt();
	
	//Ask user to enter values of list 2 
	
	System.out.print("Enter the values for the list2: ");
	
	//Call function to compare arrays 
	
	array2 = getArrays(l2);
	
	//If the res equal true they are identical if not they aren't
	
	res = equals(array1,array2);
	
	//Make if statement to check if true
	
	if(res)
		
	//Output they are identical
		
	System.out.println("The lists are identical.");
	
	else
	
	//Output they aren't identical 	
		
	System.out.println("The lists are not identical.");
	}

	//Make a method to check list 1  

	public static int[] getArray(int l1){
	
	//Declare variables 	
		
	int[] list1 = new int[100];
	
	//Call scanner 
	
	Scanner input = new Scanner(System.in);
	
	//Make if statement to check length 
	
	for(int i=0;i < l1; i++){
	list1[i] = input.nextInt();
	}
	
	//Return list 1 
	
	return list1;
	}
	
	//Make method to check list 2 
	
	public static int[] getArrays(int l2){
		
	//Declare variables 	
	  
	int[] list2 = new int[100];
	
	//Call scanner 
	
	Scanner input = new Scanner(System.in);
	
	//Make if statement to check list 2 
	
	for(int i=0;i < l2; i++){
		
	list2[i] = input.nextInt();
	}
	
	//Return list 2 
	
	return list2;
	}
	
	//Make method to compare to arrays 
	
	public static boolean equals(int[] array1, int[] array2){
		
	//Declare boolean 
		
	boolean ray = true;
	
	//Declare variables 
	
	int array_1,array_2;
	
	//Determine the length of both arrays 
	
	array_1 =array1.length;
	
	array_2 = array2.length;
	
	//Determine if array1 and array2 are null
	
	if(array1 != null && array2 != null){
		
	//If the lengths aren't same return false
		
	if(array_1 != array_2){
	ray = false;
	}
	
	//Compare lists if not same return false and else is true
	
	else {
	for(int j=0;j < array_2; j++){
	if(array2[j] != array1[j]){
	ray = false;
	}
	}
	}
	}
	else
	ray = false;
	return ray;
	
	}
	}


