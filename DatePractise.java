import java.util.Date;
import java.util.*;
public class DatePractise {

	public static void main(String args[]) {
		
		//Getting Current Date and Time
		Date date = new Date();
		System.out.println(date.toString());
		
		// Current Date and Time
		System.out.println("Current Date : " + date);
		
		// Current Date and Time
		System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
		
		System.out.println("\n");
		
		
		//Sleeping for a while
		 try { 
	         System.out.println(new Date( ) + "\n"); 
	         Thread.sleep(5*60*10); 
	         System.out.println(new Date( ) + "\n"); 
	      } catch (Exception e) {
	         System.out.println("Got an exception!"); 
	      }
	}
}
