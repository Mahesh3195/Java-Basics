
public class SwappingNumbers {

	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		swapNumbers(a,b);
		
	}
	
	public static void swapNumbers(int a,int b) {
		System.out.println("After Swapping Values \n" +a +b);
		int c = a;
		a = b;
		b = c;
		System.out.println("After Swapping Values \n" +a +b);
	}
}
