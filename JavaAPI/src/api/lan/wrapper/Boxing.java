package api.lan.wrapper;

public class Boxing {
	
	public static void main(String[] args) {
		
		int a = 100;
		double b = 3.14;
		long c = 200L;
		
		//기본형 -> 객체형 포장하는 작업을 Boxing이라고 부름
		Integer val = new Integer(a);
		Double val2 = new Double(b);
		Long val3 = new Long(c);

		Object[] arr = {val,val2,val3};
		
		//객체형 -> 기본형으로 변경하는 작업을 Unboxing 이라 부름
		
		int a2 = val.intValue();
		Double b2 = val2.doubleValue();
		Long c2 = val3.longValue();
		
		
		
	}

}
