
public class ArraysPractise {

	public static void main(String args[]) {
		
		//Print all the array elements
		double[] ages = {22.0,18.0,19.0,45.0};
		for (int i = 0; i < ages.length ; i++) {
			System.out.println(ages[i]);
		}
		
		// Summing all elements
		int[] stu_ages = {1,5,2,6,4,3};
		int total = 0;
		for (int i = 0; i < stu_ages.length; i++) {
			total += stu_ages[i];
		}
		System.out.println("Total ages of Student = " + total);
		
		// Finding the largest element
		int max = stu_ages[0];
		for (int i = 0; i < stu_ages.length; i++) {
			if (stu_ages[i] > max)max = stu_ages[i];
		}
		
		System.out.println("Largest Element = " + max);
		
		//all the elements in the array in for each loop
		int [] ids = {11,12,13,14,15,16};
		for(int element: ids) {
			System.out.println(element);
		}
		
		//practise for finding largest number in given array
		int val = ids[0];
		for(int i = 0 ; i < ids.length ; i++) {
			if(ids[i] > val)val = ids[i];
		}
		System.out.println(val); // 16

	}
	
	
}
