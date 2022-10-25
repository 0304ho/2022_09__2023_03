package day02;

import java.util.Scanner;

public class ForEx02 {
	
	public static void main(String[] args) {
		
		/* 정수를 입력받고, 입력한 정수가 소수 인지 판별
		 *  소수 -> 나누어 떨어지는수가 1과 자기자신인 수
		 *  조건 약수의 개수가 2개인 수
		 */
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 0;
		
		for(int i = 1; i<=num ; i++) {
			if(num%i==0) {
				count++;
			}
		}
		//반복을 다 돌고 나왔을때 count가 2라면 소수	
		System.out.println(count==2 ? num+"은 소수 입니다.":num+"은 소수가 아닙니다.");
		
		
	}

}
