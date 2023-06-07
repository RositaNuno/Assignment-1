//Rosita Nuno
//Practice 4 Problem 1
/*
 * Output
 * Tuition will be doubled in 11 years
 * Tuition will be $ 21048.51952299835 in 11 years
 */
public class PRAC4_1 {

	public static void main(String[] args) {
		
		//Declare variables 
		int fee = 10000;
		double doubleFee = 10000;
		int i=0;
		
		//Create while loop 
		
		while(fee*2>doubleFee) {
		doubleFee = doubleFee + (doubleFee*0.07);
		i = i + 1;
		}
		
		//Print the output 
		
		System.out.println("Tuition will be doubled in "+ i + " years");
		System.out.printf("Tuition will be $ "+ doubleFee + " in "+ i + " years");  
		
		

	}

}
