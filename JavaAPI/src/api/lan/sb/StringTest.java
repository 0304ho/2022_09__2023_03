package api.lan.sb;

public class StringTest {
	
	public static void main(String[] args) {
		long start =  System.currentTimeMillis();
		
		StringBuffer sb = new StringBuffer("");
		for(int i = 1 ; i<300000 ; i++) {
			sb.append("a");
		}
		
		long end = System.currentTimeMillis();
		System.out.println((end-start)*0.001);
		
	}

}
