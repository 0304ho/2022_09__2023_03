package day03;

import java.util.Scanner;

public class ArraySearch03 {
	
	public static void main(String[] args) {
		
		//이진탐색 -> 절반으로 나눠가며 찾아가는 과정
		//조건 -> 순서대로 나열된 데이터
		
		int[] arr = {30, 50, 80, 100, 110, 250, 300, 500};
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int low = 0;					//제일 낮은 인덱스
		int high = arr.length - 1;		//제일 높은 인덱스
		
		while(low <= high) {
			
			int mid = (low + high) /2;
			
			if(num == arr[mid]) {
				System.out.println("인덱스 위치 : "+ mid);
				break;
			}
			if(num > arr[mid]) { 	//입력값이 중간값보다 큰경우
				low = mid + 1;
			}else { 	//입력값이 중간값보다 작은경우
				high = mid - 1;
			}
			
			
			
		}
		if(low>high) {
			System.out.println("찾는값이 없습니다");
			
		}
		
		
	}

}
