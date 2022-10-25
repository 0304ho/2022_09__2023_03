package day01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayEx {
	
	public static void main(String[] args) {
	
		//배열은 선언, 생성, 초기화 과정을 거친다.
		
		//배열의 선언
		int[] arr;
		
		//배열의 생성
		arr = new int[5];
		
		System.out.println(arr); //주소값

		//배열의 초기화
		//arr[인덱스] = 값
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		//배열의 사용
		System.out.println("arr첫번째 상자 : " + arr[0]);
		System.out.println("arr세번째 상자 : " + arr[2]);
		
		//배열의 모습을 문자열로 확인하는 명령문
		//Arrays.toString()
		System.out.println(Arrays.toString(arr));
		//배열의 길이를 확인하는 명령문
		System.out.println(arr.length );

		//배열의 선언과 생성을 동시에 하는 방법
		byte[] arr2 = new byte[10];
		
		//배열의 선언 생성 초기화를 동시에 하는 방법
		int[] arr3 = {1,2,3,4,5,6,7,8};

		System.out.println(Arrays.toString(arr3));

		//배열의 초기값을 지정하지 않으면 각 타입의 기본값으로 자동 초기화
		//0 // 0.0 // null
		System.out.println(Arrays.toString(arr2));
		
		
		System.out.println("---------------------------------------------------");
		
		/*
		 * 1. 스트링 배열을 생성하고 월, 화, 수, 목 을 저장
		 * 
		 * 2. 크기가 3 인 int배열을 생성하고 1~10중 랜덤값을 저장
		 */
		
		String[] str1 = {"월", "화", "수", "목"};
		System.out.println(Arrays.toString(str1));
		
		System.out.println("---------------------------------------------------");
		
		int a= (int)(Math.random()*10+1);
		int b= (int)(Math.random()*10+1);
		int c= (int)(Math.random()*10+1);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		int [] d = {a,b,c};
		System.out.println(Arrays.toString(d));
		
		System.out.println("---------------------------------------------------");
		
		
		
	}

}
