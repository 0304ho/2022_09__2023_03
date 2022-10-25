package day02;

public class MultiForEx01 {
	
	public static void main(String[] args) {
		
		//1~9까지 돌아가는 반복문
		for(int i=1;i<=9; i++) {
			System.out.print(i+ ") ");
			
			for(int j = 1; j<=9; j++) {
				System.out.print(i+"-"+j+" ");
				
			}
			System.out.println();
			System.out.println("===================");
		}
		
		
		
	}

}
