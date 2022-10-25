package api.lan.wrapper;

public class AutoBoxing {
	
	public static void main(String[] args) {
		
		//Autoboxing = 자동형변환
		int a = 100;
		Integer val = a;
		a = val;
		
		
		Object[] arr = {1,2,3};
		int v1 = Integer.parseInt("3");
		int v2 = Integer.parseInt("34");
		
		System.out.println(v1+v2);
		
		double v3 = Double.parseDouble("3.14");
		long v4 = Long.parseLong("234234234234234");
		
		System.out.println(v1+v2+v3+v4);
		
	}

}
