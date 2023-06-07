
public class final_examPRAC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2};
	    swap(a[0], a[1]);
	    System.out.println("array is {" + a[0] + ", " + a[1] + "}");
	    //System.out.print(swap(a[0], a[1]));
	  }

	  /** Swap two variables */
	  public static void swap(int n1, int n2) {
	    int temp = n1;
	    n1 = n2;
	    n2 = temp;
	    
	    System.out.println("" +n1+ " " + n2);
	    
	    
	    
	}

}
