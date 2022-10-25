package day02;

import java.util.Scanner;

public class WhileEx04 {
	
	public static void main(String[] args) {
		
		//정수를 입력받는다
		// 입력받은 정수 까지의 합.
		
		Scanner scan = new Scanner(System.in);
		
		int i=1;
		int sum = 0;
		
		int num = scan.nextInt();
		while(i<=num) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}

		
}
