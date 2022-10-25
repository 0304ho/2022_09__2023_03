package day02;

public class While06 {
	
	public static void main(String[] args) {
		
		//배열과 반복문을 조합
		//시작은 0 
		//~ 길이 미만

		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int i = 0;
		int sum = 0;
		
//		arr[인덱스값]
		
		while(i<arr.length) {
//			System.out.println(i);      //0~9
//			System.out.println(arr[i]);   //1~10
		
			sum += arr[i]; 
			i++;

		
		}
		System.out.println("배열요소의 합 : " + sum);
		
		
		
		
		
	}

}
