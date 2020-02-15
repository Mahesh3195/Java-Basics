
public class MethodsPractise {

	public static void main(String[] args) {
	      
		  int a = 11;
	      int b = 5;
	      int c = minFunction(a, b);
	      System.out.println("Minimum Value = " + c);
	     
	      //Concept for Method Overloading
	      double e = 12.1;
	      double f = 4.2;
	      double g = minFunction(e,f);
	      System.out.println("Minimum Value = " + g);
	      
	      marks(124.2);
	      
	   }

	   /** returns the minimum of two numbers */
	   public static int minFunction(int n1, int n2) {
	      int min;
	      if (n1 > n2)
	         min = n2;
	      else
	         min = n1;

	      return min; 
	   }
	   
	   public static double minFunction(double n1,double n2) {
		   double minNum;
		   if(n1 > n2) {
			   minNum = n2;
		   }else {
			   minNum = n1;
		   }
		   return minNum;
	   }
	   
	   public static void marks(double points) {
		      if (points >= 202.5) {
		         System.out.println("Rank:A1");
		      }else if (points >= 122.4) {
		         System.out.println("Rank:A2");
		      }else {
		         System.out.println("Rank:A3");
		      }
	   }
	   
}
