package day10.exception.trycatch;

import java.util.*;
public class TryCatchEx03 {
	
	public static void main(String[] args) {
		//입력과 예외처리
		//0을 입력하기 전까지 숫자를 입력.
		
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		int num = 0;

		while(flag){
			
			try {
				System.out.print(">");
//				int num = Integer.parseInt( scan.nextLine() );
				num = scan.nextInt();		//nextInt는 정수만 받음
				if(num==0) break;	//0을 입력하면 탈출
				
			} catch (Exception e) {
				System.out.println("숫자를 입력하시오");
				scan = new Scanner(System.in);
//				scan.nextLine()
				
			}
			if(num==0) break;	//0을 입력하면 탈출
			
		}
	}

}
