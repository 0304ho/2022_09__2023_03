package day01;

public class ContinueEx01 {
	
	public static void main(String[] args) {
		
//		for(int i = 1; i<=10 ; i++) {
//			
//			if( i%2==1 ) {		//홀수
//				continue; 		//다음 반복으로 넘어감
//			}
//			System.out.println(i);
//		}
		int i = 1;
		while (i<=10) {
			
			if(i%2==1) {
				i++;
				continue; 		//바로 다음 반복으로 넘어가기 때문에  
								//i++;를 if문 안에 추가로 넣어두면 무한루프를 방지할수있음
				
//				return; 		//메인의 종료
			}
			System.out.println(i);
			i++;
		}
		System.out.println("프로그램 정상 종료");
		
		
		
	}

}
