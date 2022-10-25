package day10.exception.trycatch;

public class MultiCatchEx01 {
	
	public static void main(String[] args) {
		
		//main에 args 사용방법
//		run -> run configration -> arguments탭 -> ${string_prompt} 
//		System.out.println(args[0]);
		
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			int n1 = Integer.parseInt(data1);
			int n2 = Integer.parseInt(data2);
			String s = null;
			s.charAt(0);
			
//			System.out.println("두 수의 합 : ", (n1+n2));
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("매개값은 2개 입력하세요");
		}catch(NumberFormatException e ) {
			System.out.println("매개값은 숫자로 입력하세요");
		}catch(Exception e) {		//Exception을 쓴다는건 어떤 실행 예외든 처리가 가능하다는뜻(예외의 부모)
			//ctrl + t를 누르면 상하관계까 보임
			System.out.println("기타 예외 입니다.");
		}
		
		
	}

}
