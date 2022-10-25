package day04;

public class MethodEx02 {
	
	public static void main(String[] args) {
	/*
	 * 매개변수 = (parameter)
	 * 1. 매개변수는 메서드가 호출할때 필요한 값을 전달하는 매개체
	 * 2. 매개변수는 몇 개 받을지 매서드를 선언할 때 결정 해줍니다.
	 * 	
	 */
	
		int result = calSum(10);
		System.out.println("1~10까지의 합 : " + result);
		
		int result2 = calSum(100);
		System.out.println("1~100까지의 합 : " + result2);

		int result3 = calSum2(10,20);
		System.out.println("10~20까지의 합 : " + result3);
		
		
	} //메인끝
	
	//반환 o 매개변수 o  
	static int calSum(int end) {
		
		int sum = 0 ;
		for( int i = 1 ; i<=end ; i++) {
			sum+= i;
		}
		
		return sum;
		
	}
	
	//반환 o 매개변수 o //매개변수가 여러개
	static int calSum2(int start, int end) {
		int sum = 0;
		for(int i = start; i<=end ; i++) {
			sum+=i;
		}
		return sum;
	}
	

}
