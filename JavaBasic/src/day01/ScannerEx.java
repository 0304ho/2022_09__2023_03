package day01;


import java.util.Scanner;

public class ScannerEx {
	
	public static void main(String[] args) {
		//스캐너 생성
		Scanner scan = new Scanner(System.in);
		// 빨간줄 클릭해서 import scanner util 클릭
		//next(), nextLine(), nextInt(), nextDouble()
				
		System.out.print("이름 : ");
		String name = scan.next(); //문자열을 입력받고 name변수에 저장
		
		System.out.print("나이 : ");
		int age = scan.nextInt(); //정수를 입력받고 age변수에 저장
		
		System.out.println("입력된 이름 : " + name);
		System.out.println("입력된 나이 : " + age);
		
		scan.close(); //닫으면 이후에 scanner 사용 불가능
		
	}

}
