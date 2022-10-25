package day02;

public class WhileEx03 {
	
	public static void main(String[] args) {
		
		//3의 배수의 개수 구하기
		
		int i = 1;
		int count = 0; //개수를 체크할 변수
		while(i<=100) {
			if(i%3==0) { //i는 3의 배수
				count++;
			}
			i++;
		}
		System.out.println("3의 배수의 개수 : "+count);
		
	}

}
