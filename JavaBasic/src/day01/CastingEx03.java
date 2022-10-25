package day01;


public class CastingEx03 {
	
	public static void main(String[] args) {
		
		//연산에서의 형변환
		char c = 'C'; // 67
		int i = 2;
		System.out.println(c+i);
		
		//서로 다른 타입의 연산에서는 큰타입을 따라간다.
		char cc = (char)(c + i);
		int ii = c+i;
		
		System.out.println(cc);
		System.out.println(ii);
		
		int j = 10;
		double d = 3.14;
		double result = j+d;
		System.out.println(result);
		
		//int형보다 작은 타입의 연산의 결과는 항상 int가 된다.
		byte b1 = 100;
		byte b2 = 10;
		byte b3 = (byte)(b1+b2);
		
		short s1 = 100;
		byte s2 = 10;
		short s3 = (short)(s1+s2);
		
		
	}

}
