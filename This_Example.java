
public class This_Example {

	// Instance variable num
	int num = 10;
	
	This_Example(){
		System.out.println("This is the example of this keyword");
	}
	
	This_Example(int num){
		
		// Invoking the default constructor
		this();
		
		 // Assigning the local variable num to the instance variable num
		this.num = num;
		
	}
	
	 public void greet() {
	      System.out.println("Hi Welcome to Tutorialspoint");
	 }
	
	 public void print() {
	      
		 // Local variable num
	      int num = 20;
	      
	      // Printing the local variable
	      System.out.println("value of local variable num is : "+num);
	      
	      // Printing the instance variable
	      System.out.println("value of instance variable num is : "+this.num);
	      
	      // Invoking the greet method of a class
	      this.greet(); 
	      
	 }
	 
	public static void main(String args[]) {
		
		This_Example obj1 = new This_Example();
		obj1.print();
		
		This_Example obj2 = new This_Example(30);
		obj2.print();
		
	}
	
}
