package day02;

public class SwitchEx03 {
	
	public static void main(String[] args) {
		
		String[] arr = {"안녕", "Hello", "사요나라", "@#$"};
		
//		System.out.println(arr[0]);
		/*
		 * Math.random()을 사용해서 배열의 인덱스 범위 0~3까지 랜덥수를 만들고,
		 * 랜덤수를 배열의 index에 적용해서 출력된 단어가 
		 * 한국어, 영어, 일본어, 알수없는 언어
		 * 인지 처리를 해보세요
		 */
		
		int a = (int)(Math.random()*4);
		
			//Switch()안에 넣는 값은 정수, 문자여야 합니다.
			switch (arr[a]) {
			case "안녕":
				System.out.println("한국어");
				break;
			case "Hello":
				System.out.println(arr[1]);
				System.out.println("영어");
				break;
			case "사요나라":
				System.out.println(arr[2]);
				System.out.println("일본어");
				break;
			case "@#$":
				System.out.println(arr[3]);
				System.out.println("알수없는 언어");
				break;
			default:
				break;
			}

		
		
		
	}

}
