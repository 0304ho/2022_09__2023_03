package day01;


public class TypeInteger {
	
	public static void main(String[] args) {
		
		//byte, short, int, long
		byte a = 127;
		byte b = -128;
		
		short c = 32767;
		short d = -32768;
		
		int e = 2147483647;
		int f = -2147483648;
		
		long g = 3213513532126478887L;
		System.out.println(g);
		
		/*
		 * 2진수 저장할때는 0B를 붙임 
		 * 8진수 저장할때는 0을 붙임
		 * 16진수 저장할때는 0x를 붙임
		 */
		
		int bin = 0b1010;  //앞에 0b를 붙임으로 2진수로 변환
		System.out.println("이진수 1010은 " + bin +" 입니다.");
		int octa = 064; //앞에 0을 붙임으로 8진수로 변환
		System.out.println("팔진수 64는 " + octa +" 입니다.");
		int hexa = 0xAC00; //앞에 0x을 붙임으로 16진수로 변환
		System.out.println("십육진수 AC00은 " + hexa +" 입니다.");
		
		System.out.println("------------------------------------------------------------------");
		
		float f1 = 3.14F; //Float을 나타낼때는 F를 붙임
		double d1 = 3.14;
		
		float f2 = 3.1415923333F; //7자리까지 유효함 (신뢰성있게)
		double d2 = 3.1415923333; //15자리까지 유효함 (신뢰성있게)
		
		System.out.println(f2);
		System.out.println(d2);
		
		System.out.println("------------------------------------------------------------------");
		//e표기법
		float f3 = 314.15e-2F; //10-2승 (소수점 두칸을 왼쪽으로 옮김)
		double d3 = 0.031415e2; //10 2승 (소수점 두칸을 오른쪽으로 옮김
		System.out.println(f3);
		System.out.println(d3);
		
		System.out.println("------------------------------------------------------------------");
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println(bool1);
		System.out.println(bool2);
	}
}
