
public class MaxValue {

	public static void main(String args[]) {
		MaxFunction(2,54.2,45,13,22);
		MaxFunction(new double[]{1, 2, 3});
	}
	
	public static void MaxFunction(double ... Numbers) {
		
		double result = Numbers[0];
		for (int i = 0;Numbers.length > result; i++) 
			if( Numbers[i] > result)
			result = Numbers[i];
			System.out.println("Max Value is " + result);
	}
}
