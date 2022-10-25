package day08.static_.basic;

public class PrintArray {
	
	private PrintArray() {}
	//Arrays.toString
	public static String result ;
	
	 public static String toArray(int[] a){
		result ="[";
		for(int i = 0; i<a.length ; i++) {
			if(i<a.length-1) {
				result+=a[i]+", ";
			}
			if(i==a.length-1) result+=a[i] + "]";
		}
		return result;
	}
	
	 public static String toArray(char[] a){
		result ="[";
		for(int i = 0; i<a.length ; i++) {
			if(i<a.length-1) {
				result+=a[i]+", ";
			}
			if(i==a.length-1) result+=a[i] + "]";
		}
		return result;
	}
	
	 public static String toArray(String[] a){
		result ="[";
		for(int i = 0; i<a.length ; i++) {
			if(i<a.length-1) {
				result+=a[i]+", ";
			}
			if(i==a.length-1) result+=a[i] + "]";
		}
		return result;
	}
}
