//Rosita Nuno
//Practice 1 Problem 6 
public class PRAC1_6 {

	public static void main(String[] args) {
		//declare int 
		int num = 1;
		
		System.out.println("a  \ta**2  \ta**3");
		//make  a for loop 
		for(int i = 0; i < 10; i++) {
			int a = num;
			System.out.print(a);
			a = a * a;
			System.out.print("\t" + a);
			a = a * a;
			System.out.print("\t" + a);
			num++;
			System.out.println();
		}

	}

}
