package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {
	
	public static void main(String[] args) {
		
		//배열의 한계점 = 크기가 고정
		//입력받은 문자열을 배열에 순서대로 저장.
		
		Scanner scan = new Scanner(System.in);
		String[] arr = new String[100];
		
		//nextLine()은 엔터까지 값을 받아줌
		//next()는 스페이스까지 값을 받아줌
		//nextint()는 엔터를 받을수 없어서 엔터값 앞까지 받아줌
		
		int count = 0; //인덱스를 나타내는 변수
		
		//"그만"이라는 문자가 들어오기 전까지 입력.
		while(true) {
			
			System.out.print(">");
			String menu = scan.nextLine();
			
			if(menu.equals("그만")) {
				break;
			}
			
			arr[count] = menu;	//count번째 인덱스에 menu값 저장
			count++;			//인덱스 증가
			
		}

		String str = "[";
		
		for(int i = 0 ; i < count ; i++) {
			str += arr[i];
			if(i == count-1) {
				str += "]";
				break;
			}
			str += ", ";
		}
		System.out.println(str);
		
		
		
		
		
		
		
	}

}
