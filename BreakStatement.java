
public class BreakStatement {
	public static void main(String args[]) {
		int [] ages = {10,20,30,40,50};
		for (int x : ages) {
			if(x == 30) {
				break ; //continue
			}
			System.out.print(x);
			System.out.print("\n");
		}
	}
}
