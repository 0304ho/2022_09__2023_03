package day02;

public class DoWhileEx {
	
	public static void main(String[] args) {
		
		//while문이 do~while을 대체 할 수 있어서 많이 사용하지 않음
		
		//1~10의 합
//		int i = 1;
//		int sum = 0;
//		
//		while(i<=10) {
//			sum+=i;
//			i++;
//		}
//		System.out.println(sum);
//		
//		do~while문은 조건이 거짓이여도 무조건 한번은 실행합니다.
		int i = 1;
		int sum = 0;
		
		do {
			sum+=i;
			i++;
		}while(i<=10);
		
		System.out.println(sum);
		
	}

}
