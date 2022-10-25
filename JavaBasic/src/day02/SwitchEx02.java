package day02;

import java.util.Scanner;

public class SwitchEx02 {
	
	public static void main(String[] args) {
		
		//IfEx02와 동일하게 실행되도록
		//Switch 구문으로 변경
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수 : ");
		int point = scan.nextInt();
		
		String grade = null; //없는값으로 변수를 선언
		
		switch (point/10) {
		case 9:
			if(point >= 95) {
				grade = "A+";
			}else {
				grade = "A";
			}
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
			break;
		}
		System.out.println(grade);
		
		
		
		
	}

}
