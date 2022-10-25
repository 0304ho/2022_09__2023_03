package day01;


public class OperatorCondition {

	public static void main(String[] args) {
		//프로그램에서 랜덤한 값은 유효한 의미를 가짐
		//System.out.println(Math.random() ); //Math.random() 0~1.0미만 랜덤값을 출력
		//유효한 정수 랜덤값 1~10
		
		int num = (int)(Math.random()*10)+1;
		System.out.println(num); //1~10
		
		//랜덤값이 3의 배수인지 아닌지를 검사
		String result = num % 3 == 0 ? "3의 배수" : "3의배수가 아님:";
		//              조건문이    참이면 1번식을 실행 : 거짓이면 2번식을 실행
		System.out.println(result);
		System.out.println("---------------------------------------------");
		
		/*
		 * 1~100까지 랜덤한 정수를 생성
		 * 짝수 or 홀수인지 결과를 출력
		 */
		int ran = (int)(Math.random()*100+1);
		System.out.println(ran); 
		
		String result2= ran % 2 == 0 ? "짝수 입니다." : "홀수 입니다.";
		System.out.println(result2);
		
		System.out.println("---------------------------------------------");
		/*
		 * -5~5까지 랜덤한 정수를 출력합니다
		 * 어떤 정수가 나오든 절대값으로 출력하세요
		 */
		int ran2 = (int)(Math.random()*11-5);
		System.out.println(ran2); 
		
		int result3 = ran2 >= 0 ? ran2 : -ran2; 
		System.out.println(result3);
		
		
	
	}
}
