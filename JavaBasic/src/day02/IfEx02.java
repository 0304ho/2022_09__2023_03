package day02;

import java.util.Scanner;

public class IfEx02 {
	
	public static void main(String[] args) {
	
		//입력받은 정수에 따라서 A, B, C, D, F로 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수 : ");
		int point = scan.nextInt();
		
		String grade = null; //없는값으로 변수를 선언
		
		
		if(point>=90) {
			if (point>=95) {
				grade = "A+";
			}else {
				grade = "A";	
			}
		}else if(point >=80) {
			grade = "B";
		}else if(point>=70) {
			grade = "C";
		}else if(point>=60) {
			grade = "D";
		}else {
			grade = "F";
		}
		System.out.println(grade);
		
		
		}
			
	}

