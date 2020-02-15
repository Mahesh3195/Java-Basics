
public class NumbersClass {

	public static void main(String args[]) {
		
		//example of boxing and unboxing
		Integer x = 5;
		x = x + 5;
		System.out.print(x);
		System.out.print("\n");
		
		//example for Primitive datatype methods which are predefined
		Integer y = 10;
		y = y + 5;
		System.out.print( y.intValue());
		System.out.print("\n");
		System.out.print( y.doubleValue());
		System.out.print("\n");
		System.out.print( y.floatValue());
		System.out.print("\n");
		System.out.print( y.byteValue());
		System.out.print("\n");
		System.out.print( y.shortValue());
		System.out.print("\n");
		System.out.print(y.longValue());
		System.out.print("\n");
		
		//example for compareToMethod
		Integer z = 15;
	      
	      System.out.println(z.compareTo(3));
	      System.out.println(z.compareTo(15));
	      System.out.println(z.compareTo(18)); 
	}
}
