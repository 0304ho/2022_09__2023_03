package day02;

import java.util.Scanner;

public class MultiForEx02 {
	
	public static void main(String[] args) {
		
		//회전 할 때마다 횟수가 변하는 중첩 반복문
		/*
		 *       *
		 *      ***
		 *     *****
		 *    *******
		 *   *********
		 */
		
		Scanner scan = new Scanner(System.in);
		
//		int star = scan.nextInt();
//		
//		for(int i = 1; i<=star;i++) {
//			
////			for(int k = star-i; k>=0;k--) { 		//k는 입력변수-i  // 공백만들기
////				System.out.print(" ");
////			}
//
//			for(int j=1;j<=star-i;j++) {			//위랑 똑같은 뜻
//				System.out.print(" ");
//			}
//			
//			
//			for(int j = 1; j<=i*2-1; j++) {
//					System.out.print("*");
//				
//			}
//			System.out.println();
//			
//		}
//		
		System.out.println("=======================================");
		
		
		int star2 = scan.nextInt();
		
		
		
		for(int i = 1 ; i <= star2 ; i++) {
			for (int j = 1 ; j <= i-1 ; j++) {
				System.out.print(" ");
			}
			for(int j = 1 ; j <= (star2-i)*2+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
	}

}
