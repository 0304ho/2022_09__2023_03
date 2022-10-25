package day08.static_.basic;

public class MainArray {
	
	public static void main(String[] args) {
		
//		PrintArray parr = new PrintArray();

		int[] iarr = {1,2,3,4,5};
		System.out.println(PrintArray.toArray(iarr));
		
		
		char[] carr = {'a', 'b', 'c', 'd', 'e'};
		System.out.println(PrintArray.toArray(carr));
		
		
		String[] sarr = {"A", "B", "C", "D", "E"};
		System.out.println(PrintArray.toArray(sarr));
		

		
		
	}

}
