package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUpdate {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//배열값의 수정
		// 탐색 => 변경 => 결과출력
		String[] arr = {"어피치", "라이언", "제이지", "네오", "무지", "튜브"};
		
		System.out.print("찾을이름 > ");
		String name = scan.next();
		
		boolean flag = false; //
		
		for(int i = 0; i < arr.length ; i++) {
			if(name.equals(arr[i])) {
				System.out.print("변경할 이름 > ");
				String n = scan.next();
				arr[i] = n;		//변경
				flag = true;
			}
			
		}
		//찾음, 못찾음 구분
		
		if(flag) {
			System.out.println("별명이이 수정되었습니다.");
		}else {
			System.out.println("별명이 존재하지 않습니다.");
		}
				
				
		System.out.println(Arrays.toString(arr));
	}
	

}
