package day02;

public class ForEx01 {
	
	public static void main(String[] args) {
		
		//1~10 합계 구하기
		
		int sum = 0;
		
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		
		System.out.println(sum);
		
		System.out.println("--------------------------------------------");
		//10부터 1까지의 반복
		int sum2 = 0;
		for(int j=10;j>=0;j--) {
			sum2+=j;
		}
		System.out.println(sum2);
	}

}
