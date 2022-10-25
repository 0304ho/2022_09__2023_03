package day04;

public class MethodEx03 {
	
	public static void main(String[] args) {
		
		/*
		 * 반환유형 (return type)
		 * 1. 반환유형은 메서드가 돌려주는 값에 대한 타입
		 * 2. 반환유형이 있는 메서드는 호출 구문이 값이 되기때문에 메서드의 매개값으로 사용될 수 있다.
		 * ex)println() = 함수 -> println(메서드호출) 이런식으로 사용 가능
		 * 반환유형이 없으면 void를 입력하며 리턴 없이 실행만 하고 끝나는 메서드임.(단순실행)
		 * 3. 모든 메서드는 return을 만나면 강제종료 됩니다.
		 * 4. 리턴문 아래에는 코드를 작성 할 수 없습니다.(break와 같은 원리)
		 * 
		 */
		
//		int result = add(3,5);
//		System.out.println("결과 : " + result);
//		System.out.println(add(3,5)); //함수안에 함수가 들어갈수 있다
		
		int result = add( add(1,2), add(2,3) );
		System.out.println(result);
		
		//int r = sub(1,2); 	리턴값이 없어서 작동 안함
		//System.out.println(sub1,2));		리턴값이 없어서 작동 안함
		sub(1,2);	//단순 호출만 실행 가능
		
		noReturn("hello");		
		noReturn("bye");		
		
	}

	
	//반환 o 매개변수 o
	static int add(int a, int b) {
//		int result = a + b;
//		return result;
		return a + b;
	}

	//반환x 매개변수o	= 리턴이 없음 (단순실행)
	static void sub(int a, int b) {
		System.out.println("a - b = "+(a-b));
//		return;		//필요는 없지만 작성은 가능하다
	}
	
	//void형에서 return = 종료
	static void noReturn(String s) {
		
		if(s.equals("hello")) {		//조건검사
			System.out.println("실행종료");
			return;		//종료
		}
		System.out.println(s);
		
	}
	
}
