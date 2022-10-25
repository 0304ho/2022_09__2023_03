package day02;

public class EnhancedForEx {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		//일반 for
//		for(int i = 0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		//향상된 for문
		for(int a : arr) {
			System.out.println(a);
		}
		
		System.out.println("========================");
		
		String[] sArr = {"월", "화", "수", "목", "금 ", "금", "금"};
		
		for(String s : sArr) {
			System.out.println(s);
		}
		
		System.out.println("========================");
		//배열 요소들의 합계와 평균을 소수 2자리까지 출력
		int[] score = {31, 53, 22, 53, 68};
		int sum = 0;
		float ave = 0;
		for(int s : score) {
			sum+=s;
		}
		ave = (float)sum/score.length;
		System.out.println(sum);
		// String.format("지정한 자릿수" , 값)을 이용해서 0.00까지 표현 할 수 있음
	 	System.out.println(String.format("평균 : %.2f", ave));		
	 	System.out.printf("평균 : %.2f \n",ave);
	}

}
