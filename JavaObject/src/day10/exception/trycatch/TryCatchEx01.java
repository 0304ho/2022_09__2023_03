package day10.exception.trycatch;

public class TryCatchEx01 {
	
	public static void main(String[] args) {
		
		int a= 10;
		int b= 0;
		System.out.println(a+b);
		
		try {
			System.out.println(a/b);
			System.out.println("실행이 될까요?");
			System.out.println(a%b);
			
		//catch뒤에는 해당 예외를 처리할 수 있는 예외종류가 들어감
		} catch (Exception e) {
			System.out.println("0으로 나눌수 없습니다.");
		}
		
	}

}
