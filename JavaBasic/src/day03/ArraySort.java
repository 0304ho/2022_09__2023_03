package day03;

import java.util.Arrays;

public class ArraySort {
	
	public static void main(String[] args) {
	
		//정렬 => 7가지
		//정렬 => 선택정렬(느리지만 가장쉬움), 퀵정렬(가장빠름)
		
		int[] arr = {5, 23, 1, 43, 100, 200, 40};
		
		int temp = 0;
		
		for(int i = 0; i < arr.length-1; i++) {
			
			for(int j = i + 1 ; j < arr.length ; j++) {	
				//j는 1보다 큰 숫자부터 시작하기때문에 j=i+1
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
