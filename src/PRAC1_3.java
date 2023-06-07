//Rosita Nuno
import java.util.Scanner;

public class PRAC1_3 {

	public static void main(String[] args) {
		//Declare variables 
		double female, male, totalPeople, fPercentage, mPercentage;
		//call scanner 
		Scanner scnr = new Scanner(System.in);
		//ask user 
		System.out.println("Enter number of females: ");
		female = scnr.nextInt();
		//ask user for male 
		System.out.println("Enter number of males: ");
		male = scnr.nextInt();
		//calculate 
		totalPeople = female + male;
		fPercentage = (female / totalPeople) * 100;
		mPercentage = male / totalPeople * 100;
		//print results
		System.out.println("Female percentage: " + fPercentage);
		System.out.println("Male percentage: " + mPercentage);
		scnr.close();
		
	}

}
