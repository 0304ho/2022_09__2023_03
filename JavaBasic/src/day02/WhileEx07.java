package day02;

import java.util.Arrays;

public class WhileEx07 {
	
	public static void main(String[] args) {
		
		//최대값을 찾아라
		int[] arr = {50, 30, 40, 60, 70,90, 100, 110, 20};
		int max = arr[0]; //최대값을 저장할 변수
		int min = arr[0]; //최소값을 저장할 변수
		int i = 0;
		int j = 0;
		
		while(i<arr.length) {
			//조건 - > arr[i] 가 max 보다 크면 arr[i]를 max에 저장
			if(arr[i]>max) {
				max=arr[i];
			}
			i++;
		}
		System.out.println("최대값 : " + max);
		System.out.println("----------------------------------------------------");
		
		while(j<arr.length) {
			if(arr[j]<min) {
				min = arr[j];
			}
			j++;
		}
		System.out.println("최소값 : " + min);
	}

}
