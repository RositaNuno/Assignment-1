import java.util.Scanner;

public class methodTestSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		int x,y;
		System.out.println("Enter Values for X and Y: ");
		x =scnr.nextInt();
		y =scnr.nextInt();
		
		int total = 0;
		total = add(x,y);
		System.out.println("The total of " + x + " and " + y + " is " + total);
		System.out.println("The total of " + x + " and " + y + " is " + add(x,y));
	}
	
	public static int add(int x, int y)
	{
		int sum = 0;
		sum = x + y;
		return sum;
		
	}
	
	
		

	}


