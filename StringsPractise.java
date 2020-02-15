
public class StringsPractise {

	public static void main(String args[]) {
		
		//combining individual charcters to form a string
		char [] name = {'m','a','h','e','s','h','.','k','a','n','i','k','e'};
		String helloString = new String(name);
		System.out.print(helloString);
		System.out.print("\n");
		
		//string length
		int len = helloString.length();
		System.out.print("String Length is " +len);
		System.out.print("\n");
		
		//Concatenating Strings
		String string1 = "saw I was ";
	    System.out.println("Dot " + string1 + "Tod");
	    
	   
	}
}
